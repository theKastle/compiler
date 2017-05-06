import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;


class Codegen {
    public static PrintWriter p = null;

    private static int labelId = 0;

    private static List<String> vars = new ArrayList<String>();

    public static void addVar(String varName) {
        boolean remove = Codegen.vars.removeIf(e -> Objects.equals(e, varName));
        Codegen.vars.add(varName);
    }

    public static List getVars() {
        return Codegen.vars;
    }

    public static void printGlobalVars() {
        Codegen.generateDeclares(Codegen.vars);
    }

    public static void generateDeclares(List<String> declares) {
        // System.out.println("DECLARES  == " + declares);

        String declStr = "";
        for (String n : declares) {
            declStr += n + ": .word 0 \n ";
        }

        String result = ".data \n " + declStr + " \n .text  \n ";
        // System.out.println(result);
        p.print(result);
    }

    public static void printVar(String varName) {
        p.print("\n li $v0, 1 \n lw $a0, " + varName + " \n syscall \n");
    }

    public static void readVar(String varName) {
        p.print("\n li $v0, 5 \n syscall \n sw $v0, " + varName + " \n ");
    }

    public static void printAssign(String as) {
        p.print(as);
    }

    public static void printMips(String w) {
        p.print(w);
    }

    public static String pushStack(String register) {
        return "addi $sp, $sp, -4  \n" + "sw " + register + ", 0($sp)\n";
    }

    public static String popStack(String register) {
        return "lw " + register + ", 0($sp) \n addi $sp, $sp, 4\n";
    }

    public static String nextId() {
        String t = "" + Codegen.labelId;
        Codegen.labelId += 1;
        return t;
    }

    // public static String currentId(){
    //     int t = Codegen.nextId;
    //     return "" + t;
    // }
}
