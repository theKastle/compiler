
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\006\003\000\002\006\004\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\005\003\000" +
    "\002\005\006\000\002\011\007\000\002\011\003\000\002" +
    "\011\003\000\002\004\006\000\002\007\005\000\002\010" +
    "\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\004\011\005\001\002\000\004\002\044\001" +
    "\002\000\014\006\016\011\005\014\017\015\007\020\010" +
    "\001\002\000\004\002\000\001\002\000\004\006\042\001" +
    "\002\000\010\006\021\007\024\022\022\001\002\000\004" +
    "\012\036\001\002\000\016\006\016\011\005\012\ufffe\014" +
    "\017\015\007\020\010\001\002\000\016\006\ufff9\011\ufff9" +
    "\012\ufff9\014\ufff9\015\ufff9\020\ufff9\001\002\000\016\006" +
    "\ufffc\011\ufffc\012\ufffc\014\ufffc\015\ufffc\020\ufffc\001\002" +
    "\000\016\006\ufffb\011\ufffb\012\ufffb\014\ufffb\015\ufffb\020" +
    "\ufffb\001\002\000\004\013\032\001\002\000\010\006\021" +
    "\007\024\022\022\001\002\000\016\006\ufffa\011\ufffa\012" +
    "\ufffa\014\ufffa\015\ufffa\020\ufffa\001\002\000\012\016\ufff6" +
    "\017\ufff6\021\ufff6\023\ufff6\001\002\000\010\006\021\007" +
    "\024\022\022\001\002\000\004\017\025\001\002\000\012" +
    "\016\ufff5\017\ufff5\021\ufff5\023\ufff5\001\002\000\016\006" +
    "\ufff3\011\ufff3\012\ufff3\014\ufff3\015\ufff3\020\ufff3\001\002" +
    "\000\004\016\027\001\002\000\010\006\021\007\024\022" +
    "\022\001\002\000\004\023\031\001\002\000\012\016\ufff7" +
    "\017\ufff7\021\ufff7\023\ufff7\001\002\000\010\006\021\007" +
    "\024\022\022\001\002\000\004\017\034\001\002\000\016" +
    "\006\ufff4\011\ufff4\012\ufff4\014\ufff4\015\ufff4\020\ufff4\001" +
    "\002\000\004\012\ufffd\001\002\000\020\002\uffff\006\uffff" +
    "\011\uffff\012\uffff\014\uffff\015\uffff\020\uffff\001\002\000" +
    "\004\021\040\001\002\000\014\006\016\011\005\014\017" +
    "\015\007\020\010\001\002\000\016\006\ufff8\011\ufff8\012" +
    "\ufff8\014\ufff8\015\ufff8\020\ufff8\001\002\000\004\017\043" +
    "\001\002\000\016\006\ufff2\011\ufff2\012\ufff2\014\ufff2\015" +
    "\ufff2\020\ufff2\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\006\002\003\003\005\001\001\000\002\001" +
    "\001\000\016\003\012\004\013\005\011\006\010\007\014" +
    "\010\017\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\036\001\001\000\002\001\001\000\016\003\012" +
    "\004\013\005\011\006\034\007\014\010\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\022\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\011\025\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\027\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\032\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\003\012\004\013\005\040\007\014\010\017\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public void syntax_error(Symbol currToken) {
 
    System.exit(-1);
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ProgramNode start_val = (ProgramNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= block 
            {
              ProgramNode RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Block d = (Block)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                    // System.out.println("In Program");
                    RESULT = new ProgramNode(d);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // block ::= BEGIN stmts END 
            {
              Block RESULT =null;
		int ssleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Statements ss = (Statements)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  //System.out.println("In Block");
                    RESULT = new Block(ss);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("block",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmts ::= stmt 
            {
              Statements RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    //System.out.println("In Statements -- Single");
                    RESULT = new Statements(s);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmts",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmts ::= stmt stmts 
            {
              Statements RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int slleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int slright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Statements sl = (Statements)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    //System.out.println("In Statements");
                    sl.add(s);
                    RESULT = sl;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmts",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= variable 
            {
              Statement RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Variable v = (Variable)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    //System.out.println("In Statement");
                    RESULT = v;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= writeStmt 
            {
              Statement RESULT =null;
		int wleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int wright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		WriteStatement w = (WriteStatement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    RESULT = w;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmt ::= readStmt 
            {
              Statement RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ReadStatement r = (ReadStatement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    RESULT = r;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmt ::= block 
            {
              Statement RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    RESULT = b;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmt ::= WHILE expr DO stmt 
            {
              Statement RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    RESULT = new WhileStmt(e, s);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= LP expr SUB expr RP 
            {
              Expr RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Expr e1 = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr e2 = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                    System.out.println("In SUB");
                    RESULT = new SubExpr(e1, e2);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= ID 
            {
              Expr RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IdTokenVal id = (IdTokenVal)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    System.out.println("In ID");
                    RESULT = new IdExpr(id);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= INTLITERAL 
            {
              Expr RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IntLitTokenVal i = (IntLitTokenVal)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    System.out.println("In INT");
                    RESULT = new IntExpr(i);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // variable ::= ID EQ expr SEM 
            {
              Variable RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		IdTokenVal id = (IdTokenVal)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
                    System.out.println("In Variable");
                    RESULT = new Variable(id, e);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // writeStmt ::= WRITE expr SEM 
            {
              WriteStatement RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr id = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                    RESULT = new WriteStatement(id);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("writeStmt",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // readStmt ::= READ ID SEM 
            {
              ReadStatement RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		IdTokenVal id = (IdTokenVal)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                    RESULT = new ReadStatement(id);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("readStmt",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
