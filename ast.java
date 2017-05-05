
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
        String declares = "";
        Iterable<Statement> iterable = this.statements;
        List<Statement> vars = new ArrayList<Statement>();

        System.out.println("In Program CodeGen");
        System.out.println(statements.size());

        for (int i = statements.size() - 1; i >= 0; i--) {
            Statement n = statements.get(i);
            System.out.println(n.getName());
            if (n instanceof Variable || n instanceof ReadStatement) {
                System.out.println(n.getName() + " --- ");
                boolean remove = vars.removeIf(e -> Objects.equals(e.getName(), n.getName()));
                
                vars.add(n);
            }
        }

        List<String> varNames = new ArrayList<String>();
        for (Statement n : vars) {
            String t = n.getName();
            // System.out.println("In Declares -- " + t);
            varNames.add(t);
        }

        Codegen.generateDeclares(varNames);
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

    public String getName() {
        // System.out.println("In Variable getName  -- " + varName);
        return varName;
    }

    public Variable(Expr id, Expr val) {
        this.varName = id.getName();
        this.varValue = val.getName();
    }

    public String codeGen() {
        return "addi $t0, $zero, " + varValue + " \n sw $t0, " + varName + "\n"; // varName + ": .word " + varValue + " \n ";
    }
}

class WriteStatement extends Statement {
    private String id;

    public String getName() {
        return id;
    }

    public WriteStatement(Expr id) {
        this.id = id.codeGen();
    }

    public String codeGen() {
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
    String val;

    abstract public String codeGen();

    abstract public String getName();
}

class SubExpr extends Expr {

    String id1;
    String id2;

    public SubExpr(Expr e1, Expr e2) {
        id1 = e1.codeGen();
        id2 = e2.codeGen();
    }

    public String codeGen() {
        return "lw $t0, " + id1 + "\n lw $t1, " + id2 + "\n sub $t2, $t0, $t1 \n";
    }

    public String getName() {
        return "";
    }

}

class PrimaryExpr extends Expr {
    String id;

    public PrimaryExpr(IntLitTokenVal i) {
        id = "" + i.intVal; // .toString();
    }

    public PrimaryExpr(IdTokenVal id) {
        this.id = id.idVal;
    }

    public String codeGen() {
        return id;
    }

    public String getName() {
        return id;
    }
}