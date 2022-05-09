
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package InicioJson;

import java_cup.runtime.Symbol;
import main.proyectstructure.Tipo;
import main.proyectstructure.Carta;
import java.util.ArrayList;
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
    "\000\015\000\002\002\004\000\002\006\004\000\002\002" +
    "\003\000\002\002\003\000\002\003\003\000\002\005\004" +
    "\000\002\007\012\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\004\003\000\002" +
    "\004\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\031\000\004\004\005\001\002\000\004\002\033\001" +
    "\002\000\006\005\012\006\013\001\002\000\004\002\ufffe" +
    "\001\002\000\006\005\012\011\027\001\002\000\004\002" +
    "\uffff\001\002\000\004\002\000\001\002\000\004\002\ufffd" +
    "\001\002\000\004\016\014\001\002\000\004\006\015\001" +
    "\002\000\004\007\016\001\002\000\004\006\017\001\002" +
    "\000\004\016\020\001\002\000\012\012\023\013\024\014" +
    "\022\015\025\001\002\000\004\006\026\001\002\000\004" +
    "\006\ufff8\001\002\000\004\006\ufff9\001\002\000\004\006" +
    "\ufffa\001\002\000\004\006\ufff7\001\002\000\006\005\ufffb" +
    "\011\ufffb\001\002\000\004\006\013\001\002\000\004\002" +
    "\ufffc\001\002\000\004\002\ufff6\001\002\000\004\002\ufff5" +
    "\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\031\000\004\006\003\001\001\000\002\001\001\000" +
    "\012\002\010\003\007\005\005\007\006\001\001\000\002" +
    "\001\001\000\006\003\030\004\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\020\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\031\007\006" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

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


 
    private ArrayList<Carta> cartas = new ArrayList<>();
    private boolean errores = false;

    public boolean isErrores(){
        return errores;
    }

    public ArrayList<Carta> getCartas(){
        return cartas;
    }

    public void syntax_error(Symbol s){
        errores = true;
        System.out.println("Error sintactico: " + s.value.toString() + " Linea:" + s.right + " Columna:" + s.left + ". ");
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        errores = true;
        System.out.println("No se pudo recuperar el analizador. Linea:" + s.right + " Columna:" + s.left + "\n");
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
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= LLAVE_A s0 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // s0 ::= s1 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s0",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // s0 ::= s3 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s0",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // s1 ::= LLAVE_C 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // s3 ::= carta s2 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s3",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // carta ::= COMILLAS ENTERO COMILLAS DOS_PUNTOS COMILLAS ENTERO tipo COMILLAS 
            {
              String RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tipo var2 = (Tipo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		cartas.add(new Carta(Integer.valueOf(var1), var2));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("carta",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // tipo ::= TREBOL 
            {
              Tipo RESULT =null;
		RESULT=Tipo.TREBOL;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // tipo ::= CORAZON 
            {
              Tipo RESULT =null;
		RESULT=Tipo.CORAZON;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // tipo ::= DIAMANTE 
            {
              Tipo RESULT =null;
		RESULT=Tipo.DIAMANTE;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // tipo ::= PICA 
            {
              Tipo RESULT =null;
		RESULT=Tipo.PICA;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // s2 ::= s1 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s2",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // s2 ::= COMA s3 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s2",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
