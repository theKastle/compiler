import java_cup.runtime.*; // defines the Symbol class

// The generated scanner will return a Symbol for each token that it finds.
// A Symbol contains an Object field named value; that field will be of type
// TokenVal, defined below.
//
// A TokenVal object contains the line number on which the token occurs as
// well as the number of the character on that line that starts the token.
// Some tokens (literals and IDs) also include the value of the token.

class TokenVal {
  // fields
    int linenum;
    int charnum;
  // constructor
    TokenVal(int line, int ch) {
        linenum = line;
        charnum = ch;
    }
}

class IntLitTokenVal extends TokenVal {
  // new field: the value of the integer literal
    int intVal;
  // constructor
    IntLitTokenVal(int line, int ch, int val) {
        super(line, ch);
        intVal = val;
    }
}

class IdTokenVal extends TokenVal {
  // new field: the value of the identifier
    String idVal;
  // constructor
    IdTokenVal(int line, int ch, String val) {
        super(line, ch);
    idVal = val;
    }
}

class StrLitTokenVal extends TokenVal {
  // new field: the value of the string literal
    String strVal;
  // constructor
    StrLitTokenVal(int line, int ch, String val) {
        super(line, ch);
        strVal = val;
    }
}

// The following class is used to keep track of the character number at which
// the current token starts on its line.
class CharNum {
    static int num=1;
}
%%

LineTerminator = \r|\n|\r\n
DIGIT=        [0-9]
WHITESPACE=   {LineTerminator} | [\040\t]
LETTER=       [a-zA-Z]
ESCAPEDCHAR=   [nt'\"?\\]
NOTNEWLINEORESCAPEDCHAR=   [^\nnt'\"?\\]
NOTNEWLINEORQUOTE= [^\n\"]
NOTNEWLINEORQUOTEORESCAPE= [^\n\"\\]


%implements java_cup.runtime.Scanner
%function next_token
%type java_cup.runtime.Symbol

%eofval{
return new Symbol(sym.EOF);
%eofval}

%line

%%

"begin"       { Symbol S = new Symbol(sym.BEGIN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"end"       { Symbol S = new Symbol(sym.END, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"write"       { Symbol S = new Symbol(sym.WRITE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"read"       { Symbol S = new Symbol(sym.READ, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"while"       { Symbol S = new Symbol(sym.WHILE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"do"       { Symbol S = new Symbol(sym.DO, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"="       { Symbol S = new Symbol(sym.EQ, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }   

"-"       { Symbol S = new Symbol(sym.SUB, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          } 

"+"       { Symbol S = new Symbol(sym.ADD, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"*"       { Symbol S = new Symbol(sym.MUL, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          } 

"/"       { Symbol S = new Symbol(sym.DIV, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"%"       { Symbol S = new Symbol(sym.MOD, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

";"       { Symbol S = new Symbol(sym.SEM, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          } 
          
"("       { Symbol S = new Symbol(sym.LP, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          } 

")"       { Symbol S = new Symbol(sym.RP, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          } 

({LETTER}|"_")({LETTER}|{DIGIT}|"_")* {
            Symbol S = new Symbol(sym.ID, 
                             new IdTokenVal(yyline+1, CharNum.num, yytext()));
            CharNum.num += yytext().length();
            return S;
          }

{DIGIT}+  { double val = Double.parseDouble(yytext());
            int intVal;
        
           
                intVal = Integer.parseInt(yytext());
        
            Symbol S = new Symbol(sym.INTLITERAL,
                             new IntLitTokenVal(yyline+1, CharNum.num, intVal));
            CharNum.num += yytext().length();
            return S;
          }

          

          

    
          
\n        { CharNum.num = 1; }

{WHITESPACE}+  { CharNum.num += yytext().length(); }

("//"|"#")[^\n]*  { // comment - ignore. Note: don't need to update char num 
            // since everything to end of line will be ignored
          }

