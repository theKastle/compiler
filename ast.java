
import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

abstract class ASTnode {
}

// **********************************************************************
// ProgramNode,  DeclListNode, FormalsListNode, FnBodyNode,
// StmtListNode, ExpListNode
// **********************************************************************

class ProgramNode extends ASTnode {
    List<Statement> statements = new ArrayList<>();

    public ProgramNode(Block L) {
        System.out.println("In Program -- Constructor");
        myBlock = L;
        this.statements.addAll(myBlock.getStatements());
        System.out.println(statements.get(0).getName());
        System.out.println("In Program -- Constructor -- Done");
    }

    public void codeGen() {
        // String declares = "";
        // List<Statement> vars = new ArrayList<Statement>();

        // for (int i = statements.size() - 1; i >= 0; i--) {
        //     Statement n = statements.get(i);
        //     System.out.println(n.getName());
        //     if (n instanceof Variable || n instanceof ReadStatement) {
        //         System.out.println(n.getName() + " --- ");
        //         boolean remove = vars.removeIf(e -> Objects.equals(e.getName(), n.getName()));

        //         vars.add(n);
        //     }
        // }

        // List<String> varNames = new ArrayList<String>();
        // for (Statement n : vars) {
        //     String t = n.getName();
        //     // System.out.println("In Declares -- " + t);
        //     varNames.add(t);
        // }
        Codegen.printGlobalVars();
        // Codegen.generateDeclares(varNames);
        myBlock.codeGen();
    }

    private Block myBlock;
}

class Block extends Statement {
    private Number n;
    private List<Statement> statements = new ArrayList<>();

    public Block(Statements statementList) {
        System.out.println("In Block -- Constructor");
        statements.addAll(statementList.stmts);
        System.out.println("In Block -- Constructor -- Done -- ");
    }

    public String getName() {
        return "";
    }

    public String codeGen() {
        Iterable<Statement> iterable = statements;

        for (int i = statements.size() - 1; i >= 0; i--) {
            Statement tmp = statements.get(i);
            if (tmp instanceof ReadStatement) {
                ReadStatement r = (ReadStatement) tmp;
                Codegen.readVar(r.getName());
            }
            if (tmp instanceof WriteStatement) {
                WriteStatement w = (WriteStatement) tmp;
                Codegen.printVar(w.getName());
            }
            if (tmp instanceof Variable) {
                Variable v = (Variable) tmp;
                Codegen.printAssign(v.codeGen());
            }
            if (tmp instanceof Block) {
                Block b = (Block) tmp;
                b.codeGen();
            }
            if (tmp instanceof WhileStmt) {
                WhileStmt l = (WhileStmt) tmp;
                l.codeGen();
            }
        }

        // for (Statement n : iterable) {
        return "";
        // }
    }

    public List getStatements() {
        return this.statements;
    }
}

class Variable extends Statement {
    private String varName;
    private String varValue;
    private Expr rhs;

    public String getName() {
        // System.out.println("In Variable getName  -- " + varName);
        return varName;
    }

    public Variable(IdTokenVal id, Expr val) {
        this.varName = id.idVal;
        System.out.println("The lhs varName  = " + this.varName);

        if (!(val instanceof SubExpr || val instanceof MulExpr)) {
            this.varValue = val.getName();
        } else {
            this.rhs = val;
            this.varValue = "";
        }
        Codegen.addVar(varName);
    }

    public String codeGen() {
        if (this.varValue != "") {
            return "addi $t0, $zero, " + varValue + " \n sw $t0, " + varName + "\n"; // varName + ": .word " + varValue + " \n ";
        } else {
            System.out.println("-- SUB SUB --");
            String executeRhs = this.rhs.codeGen();
            String loadRhs = this.rhs.loadValueInto("$t2");
            System.out.println("CodeGen -- The lhs varName  = " + this.varName);
            return executeRhs + loadRhs + "addi $t0, $t2, 0 \n sw $t0, " + varName + "\n";
        }

    }
}

class WriteStatement extends Statement {
    private String id;

    public String getName() {
        return id;
    }

    public WriteStatement(Expr id) {
        this.id = id.getName();
        Codegen.addVar(this.id);
    }

    public String codeGen() {
        Codegen.printVar(id);
        return "";
    }
}

class ReadStatement extends Statement {
    public IdTokenVal id;

    public String getName() {
        return id.idVal;
    }

    public ReadStatement(IdTokenVal id) {
        this.id = id;
        Codegen.addVar(id.idVal);
    }

    public String codeGen() {
        return id.idVal + ": .word 0 \n ";
    }
}

abstract class Statement {
    abstract public String codeGen();

    abstract public String getName();
}

class Statements {
    List<Statement> stmts = new ArrayList<Statement>();

    public Statements(Statements sl) {
        this.stmts.addAll(sl.stmts);
    }

    public Statements(Statement s) {
        System.out.println("In Statements Constructor");
        System.out.println(s.getName());
        this.stmts.add(s);
        System.out.println("In Statements Constructor -- Done");
    }

    public boolean add(Statement s) {
        return stmts.add(s);
    }

    public void clear() {
        stmts.clear();
    }

    public Iterator<Statement> iterator() {
        return stmts.iterator();
    }

    public List getList() {
        return this.stmts;
    }
}

abstract class Expr {
    String varName;

    abstract public String loadValueInto(String register);

    abstract public String codeGen();

    abstract public String getName();
}

class SubExpr extends Expr {

    String varName;
    Expr id1;
    Expr id2;

    public SubExpr(Expr e1, Expr e2) {
        id1 = e1;
        if (!(e1 instanceof IntExpr)) {
            varName = e1.getName();
        } else if (!(e2 instanceof IntExpr)) {
            varName = e2.getName();
        } else {
            varName = "$t7";
        }
        id2 = e2;
    }

    public String codeGen() {
        String e1 = this.id1.codeGen();
        String e2 = this.id2.codeGen();
        return e1 + e2 + this.id1.loadValueInto("$t0") + this.id2.loadValueInto("$t1") + "sub $t2, $t0, $t1 \n sw $t2, "
                + this.varName;
        // return "lw $t0, " + id1 + "\n lw $t1, " + id2 + "\n sub $t2, $t0, $t1 \n";
    }

    public String getName() {
        return this.varName;
    }

    public String loadValueInto(String register) {
        if (this.id1 instanceof IntExpr && this.id2 instanceof IntExpr) {
            return "\naddi " + register + ", $t7, 0";
        }
        return "\nlw " + register + ", " + this.varName + "\n";
    }
}

class MulExpr extends Term {

    String varName;
    Expr id1;
    Expr id2;

    public MulExpr(Expr e1, Expr e2) {
        super(e1);
        id1 = e1;
        if (!(e1 instanceof IntExpr)) {
            varName = e1.getName();
        } else if (!(e2 instanceof IntExpr)) {
            varName = e2.getName();
        } else {
            varName = "$t7";
        }
        id2 = e2;
    }

    public String codeGen() {
        String e1 = this.id1.codeGen();
        String e2 = this.id2.codeGen();
        return e1 + e2 + this.id1.loadValueInto("$t0") + this.id2.loadValueInto("$t1") + "mul $t2, $t0, $t1 \n sw $t2, "
                + this.varName;
        // return "lw $t0, " + id1 + "\n lw $t1, " + id2 + "\n sub $t2, $t0, $t1 \n";
    }

    public String getName() {
        return this.varName;
    }

    public String loadValueInto(String register) {
        if (this.id1 instanceof IntExpr && this.id2 instanceof IntExpr) {
            return "\naddi " + register + ", $t7, 0";
        }
        return "\nlw " + register + ", " + this.varName + "\n";
    }
}

class IdExpr extends Expr {
    String varName;

    public IdExpr(IdTokenVal i) {
        varName = "" + i.idVal; // .toString();
        Codegen.addVar(varName);
    }

    public String codeGen() {
        return "\n";
    }

    public String getName() {
        return varName;
    }

    public String loadValueInto(String register) {
        return "\nlw " + register + ", " + this.varName + "\n";
    }
}

class IntExpr extends Expr {
    String varName;

    public IntExpr(IntLitTokenVal i) {
        varName = "" + i.intVal; // .toString();
        System.out.println("INTEXPR -- " + this.varName);
    }

    public String codeGen() {
        return "\naddi $t7, $zero, " + varName + "\n";
    }

    public String getName() {
        return varName;
    }

    public String loadValueInto(String register) {
        return "\naddi " + register + ", $zero, " + this.varName + "\n";
    }
}

class WhileStmt extends Statement {

    Expr e;
    Statement s;
    public WhileStmt(Expr e, Statement s) {
        this.e = e;
        this.s = s;
    }

    public String codeGen() {
        String w = "while:\n" 
                + this.e.loadValueInto("$t0")
                + "\nblt $t0, 1, exit\n";
        Codegen.printMips(w);        
        this.s.codeGen();
        String w2 = "\nj while\n"
                + "exit: "   ;
        Codegen.printMips(w2);
        return "";
    }

    public String getName() {
        return "";
    }
}

class Term extends Expr {
    String varName;
    Expr e;

    public Term(Expr e) {
        this.e = e;
    }

    public String loadValueInto(String register){
        return e.loadValueInto(register);
    }

    public String codeGen(){
        return e.codeGen();
    }

    public String getName(){
        return e.getName();
    }
}

class Ef extends Expr {
    String varName;
    Expr e;

    public Ef (Expr e) {
        this.e = e;
    }

    public String loadValueInto(String register){
        return e.loadValueInto(register);
    }

    public String codeGen(){
        return e.codeGen();
    }

    public String getName(){
        return e.getName();
    }
}