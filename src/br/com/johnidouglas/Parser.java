
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Oct 24 23:11:50 BRST 2017
//----------------------------------------------------

package br.com.johnidouglas;

import java_cup.runtime.*;
import java.io.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Oct 24 23:11:50 BRST 2017
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\005\000\002\004" +
    "\004\000\002\004\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\005\003\000" +
    "\002\003\010\000\002\003\010\000\002\011\005\000\002" +
    "\011\003\000\002\012\007\000\002\012\005\000\002\012" +
    "\021\000\002\015\006\000\002\016\003\000\002\014\005" +
    "\000\002\014\005\000\002\014\005\000\002\014\005\000" +
    "\002\014\005\000\002\014\005\000\002\006\007\000\002" +
    "\013\006\000\002\007\007\000\002\010\005\000\002\010" +
    "\003\000\002\010\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\125\000\004\004\005\001\002\000\004\002\127\001" +
    "\002\000\014\006\017\011\012\012\014\015\020\021\006" +
    "\001\002\000\004\012\120\001\002\000\016\005\117\006" +
    "\017\011\012\012\014\015\020\021\006\001\002\000\016" +
    "\005\ufffe\006\ufffe\011\ufffe\012\ufffe\015\ufffe\021\ufffe\001" +
    "\002\000\016\005\ufffb\006\ufffb\011\ufffb\012\ufffb\015\ufffb" +
    "\021\ufffb\001\002\000\006\031\112\032\113\001\002\000" +
    "\016\005\ufffd\006\ufffd\011\ufffd\012\ufffd\015\ufffd\021\ufffd" +
    "\001\002\000\010\014\107\031\065\032\066\001\002\000" +
    "\016\005\ufffc\006\ufffc\011\ufffc\012\ufffc\015\ufffc\021\ufffc" +
    "\001\002\000\016\005\ufffa\006\ufffa\011\ufffa\012\ufffa\015" +
    "\ufffa\021\ufffa\001\002\000\006\011\026\012\027\001\002" +
    "\000\004\012\022\001\002\000\016\005\ufff9\006\ufff9\011" +
    "\ufff9\012\ufff9\015\ufff9\021\ufff9\001\002\000\004\017\023" +
    "\001\002\000\004\020\024\001\002\000\004\016\025\001" +
    "\002\000\016\005\uffe9\006\uffe9\011\uffe9\012\uffe9\015\uffe9" +
    "\021\uffe9\001\002\000\004\007\103\001\002\000\004\007" +
    "\030\001\002\000\004\012\031\001\002\000\004\010\032" +
    "\001\002\000\012\011\012\012\033\025\036\027\040\001" +
    "\002\000\010\014\077\031\065\032\066\001\002\000\016" +
    "\005\ufff5\006\ufff5\011\ufff5\012\ufff5\015\ufff5\021\ufff5\001" +
    "\002\000\016\005\ufff7\006\ufff7\011\ufff7\012\ufff7\015\ufff7" +
    "\021\ufff7\001\002\000\010\011\012\012\033\027\040\001" +
    "\002\000\004\010\073\001\002\000\006\011\012\012\041" +
    "\001\002\000\006\031\065\032\066\001\002\000\004\010" +
    "\043\001\002\000\004\033\045\001\002\000\004\035\052" +
    "\001\002\000\004\022\046\001\002\000\004\034\047\001" +
    "\002\000\004\023\ufff0\001\002\000\004\023\051\001\002" +
    "\000\024\005\ufff1\006\ufff1\011\ufff1\012\ufff1\015\ufff1\021" +
    "\ufff1\026\ufff1\030\ufff1\035\ufff1\001\002\000\006\011\012" +
    "\012\041\001\002\000\004\010\054\001\002\000\004\033" +
    "\045\001\002\000\004\035\056\001\002\000\006\011\012" +
    "\012\041\001\002\000\004\010\060\001\002\000\004\033" +
    "\045\001\002\000\004\030\062\001\002\000\004\010\063" +
    "\001\002\000\004\033\045\001\002\000\020\005\ufff2\006" +
    "\ufff2\011\ufff2\012\ufff2\015\ufff2\021\ufff2\026\ufff2\001\002" +
    "\000\006\011\072\012\071\001\002\000\006\011\070\012" +
    "\067\001\002\000\020\005\uffee\006\uffee\010\uffee\011\uffee" +
    "\012\uffee\015\uffee\021\uffee\001\002\000\020\005\uffef\006" +
    "\uffef\010\uffef\011\uffef\012\uffef\015\uffef\021\uffef\001\002" +
    "\000\020\005\uffeb\006\uffeb\010\uffeb\011\uffeb\012\uffeb\015" +
    "\uffeb\021\uffeb\001\002\000\020\005\uffec\006\uffec\010\uffec" +
    "\011\uffec\012\uffec\015\uffec\021\uffec\001\002\000\004\033" +
    "\045\001\002\000\020\005\ufff3\006\ufff3\011\ufff3\012\ufff3" +
    "\015\ufff3\021\ufff3\026\ufff3\001\002\000\004\026\076\001" +
    "\002\000\016\005\ufff6\006\ufff6\011\ufff6\012\ufff6\015\ufff6" +
    "\021\ufff6\001\002\000\004\012\100\001\002\000\004\013" +
    "\101\001\002\000\004\011\102\001\002\000\020\005\ufff4" +
    "\006\ufff4\011\ufff4\012\ufff4\015\ufff4\021\ufff4\026\ufff4\001" +
    "\002\000\004\011\104\001\002\000\004\010\105\001\002" +
    "\000\012\011\012\012\033\025\036\027\040\001\002\000" +
    "\016\005\ufff8\006\ufff8\011\ufff8\012\ufff8\015\ufff8\021\ufff8" +
    "\001\002\000\004\011\110\001\002\000\004\016\111\001" +
    "\002\000\016\005\uffe8\006\uffe8\011\uffe8\012\uffe8\015\uffe8" +
    "\021\uffe8\001\002\000\004\011\115\001\002\000\004\011" +
    "\114\001\002\000\020\005\uffed\006\uffed\010\uffed\011\uffed" +
    "\012\uffed\015\uffed\021\uffed\001\002\000\020\005\uffea\006" +
    "\uffea\010\uffea\011\uffea\012\uffea\015\uffea\021\uffea\001\002" +
    "\000\016\005\uffff\006\uffff\011\uffff\012\uffff\015\uffff\021" +
    "\uffff\001\002\000\004\002\000\001\002\000\004\022\121" +
    "\001\002\000\010\012\122\023\uffe4\024\uffe4\001\002\000" +
    "\006\023\uffe5\024\uffe5\001\002\000\006\023\124\024\125" +
    "\001\002\000\016\005\uffe7\006\uffe7\011\uffe7\012\uffe7\015" +
    "\uffe7\021\uffe7\001\002\000\004\012\126\001\002\000\006" +
    "\023\uffe6\024\uffe6\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\125\000\004\002\003\001\001\000\002\001\001\000" +
    "\020\003\012\004\006\005\007\006\014\007\010\013\015" +
    "\014\020\001\001\000\002\001\001\000\016\003\012\005" +
    "\115\006\014\007\010\013\015\014\020\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\011\034\012\033\014\036" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\012\074\014\036\001\001\000\002\001\001" +
    "\000\004\014\041\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\015\043\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\016\047\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\014\052\001\001" +
    "\000\002\001\001\000\004\015\054\001\001\000\002\001" +
    "\001\000\004\014\056\001\001\000\002\001\001\000\004" +
    "\015\060\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\015\063\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\073\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\011" +
    "\105\012\033\014\036\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\122\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	public void report_error(String message, Object info)  {
	    System.out.println("Warning - " + message);
	}
	
	public void report_fatal_error(String message, Object info)  {
	    System.out.println("Error - " + message);
	    System.exit(-1);
	}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // funcao_parametros ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funcao_parametros",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // funcao_parametros ::= ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funcao_parametros",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // funcao_parametros ::= funcao_parametros VIRGULA ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funcao_parametros",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // funcao ::= FUNCAO ID ABRE_PARENTESES funcao_parametros FECHA_PARENTESES 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funcao",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // atribui_valor_variavel ::= ID ATRIBUICAO NUMERO PONTO_E_VIRGULA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("atribui_valor_variavel",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // variavel ::= VARIAVEL ID DOIS_PONTOS TIPO_INTEIRO PONTO_E_VIRGULA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variavel",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // condicao ::= NUMERO MAIOR NUMERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicao",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // condicao ::= ID MAIOR ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicao",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // condicao ::= ID MAIOR NUMERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicao",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // condicao ::= NUMERO MENOR NUMERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicao",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // condicao ::= ID MENOR ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicao",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // condicao ::= ID MENOR NUMERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicao",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // imprime_mensagem ::= MENSAGEM 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("imprime_mensagem",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // condicao_conteudo ::= IMPRIMIR ABRE_PARENTESES imprime_mensagem FECHA_PARENTESES 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicao_conteudo",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // laco_conteudo ::= SE condicao FACA condicao_conteudo SENAOSE condicao FACA condicao_conteudo SENAOSE condicao FACA condicao_conteudo SENAO FACA condicao_conteudo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("laco_conteudo",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-14)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // laco_conteudo ::= condicao FACA condicao_conteudo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("laco_conteudo",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // laco_conteudo ::= ID ATRIBUICAO ID MULTIPLICACAO NUMERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("laco_conteudo",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // laco_bloco ::= laco_conteudo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("laco_bloco",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // laco_bloco ::= ABRE_CHAVE laco_conteudo FECHA_CHAVE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("laco_bloco",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // laco ::= PARA ID ATE ID FACA laco_bloco 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("laco",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // laco ::= PARA NUMERO ATE NUMERO FACA laco_bloco 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("laco",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // declaracoes ::= condicao 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracoes",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // declaracoes ::= atribui_valor_variavel 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracoes",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // declaracoes ::= funcao 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracoes",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaracoes ::= variavel 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracoes",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaracoes ::= laco 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracoes",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // bloco ::= declaracoes 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("bloco",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // bloco ::= bloco declaracoes 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("bloco",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programa ::= INICIO bloco FIM 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

