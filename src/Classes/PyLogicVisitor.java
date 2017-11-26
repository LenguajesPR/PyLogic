package Classes;

import Classes.PyLogic3Parser.*;
import java.util.*;
import Tools.*;

public class PyLogicVisitor<T> extends PyLogic3BaseVisitor<Node>  {
    static final int ID =1,ENTERO=2,FLOAT=3,IMAG=4,BINARIO=5,HEXA=6,OCTAL=7,TRUE=8,FALSE=9,STRING=10,BITS=11,NONE=12;
    
    LinkedList<HashMap<Object,Object> > tablas = new LinkedList<>();
    HashMap<Object, Object> table = new HashMap<>();
    HashMap<Object, Object> temp = new HashMap<>();
    
    public void init(){
        tablas.add(table);
    }
    
    @Override
    public Node visitStmt(StmtContext ctx){
        Node aux = null;
        if(ctx.simple_stmt() != null){
            visitSimple_stmt(ctx.simple_stmt());
        }if(ctx.compound_stmt() != null){
            visitCompound_stmt(ctx.compound_stmt());
        }if(ctx.fact() != null){
            visitFact(ctx.fact());
        }if(ctx.rules() != null){
            visitRules(ctx.rules());
        }if(ctx.print() != null){
            visitPrint(ctx.print());
        }
        return aux;
    }
    
    @Override
    public Node visitSimple_stmt(Simple_stmtContext ctx){
        Node aux = null;
        for (int i = 0; i < ctx.small_stmt().size(); i++) {
            visitSmall_stmt(ctx.small_stmt(i));
        }
        return aux;
    }
    
    @Override
    public Node visitSmall_stmt(Small_stmtContext ctx){
        Node aux = null;
        if(ctx.expr_stmt() != null){
            visitExpr_stmt(ctx.expr_stmt());
        }if(ctx.del_stmt() != null){
            visitDel_stmt(ctx.del_stmt());
        }if(ctx.pass_stmt() != null){
            visitPass_stmt(ctx.pass_stmt());
        }if(ctx.flow_stmt() != null){
            visitFlow_stmt(ctx.flow_stmt());
        }if(ctx.import_stmt() != null){
            visitImport_stmt(ctx.import_stmt());
        }if(ctx.global_stmt() != null){
            visitGlobal_stmt(ctx.global_stmt());
        }if(ctx.nonlocal_stmt() != null){
            visitNonlocal_stmt(ctx.nonlocal_stmt());
        }if(ctx.assert_stmt() != null){
            visitAssert_stmt(ctx.assert_stmt());
        }
        return aux;
    }
    
    //No retorna nada
    @Override 
    public Node visitExpr_stmt(Expr_stmtContext ctx) { 
        Node aux = visitChildren(ctx); 
        if(ctx.testlist_star_expr().size()==1){
            return aux;
        }else{
            String nombre = ctx.testlist_star_expr(0).getText();
            Node valor = visitTestlist_star_expr(ctx.testlist_star_expr(1));
            //List<TerminalNode> asd = ctx.testlist_star_expr();
            LinkedList<Node> listaTestList = new LinkedList<Node>();
            for(int i = 0; i < ctx.testlist_star_expr().size();i++){
                listaTestList.add(visitTestlist_star_expr(ctx.testlist_star_expr(i)));
            }
            table.put(nombre, valor);
            System.out.println(nombre);
            System.out.println(valor);
        }
        
        //System.out.println(ctx.getText());
        //System.out.println();
        return aux;
    }
    
    @Override 
    public Node visitTest(TestContext ctx) { 
        return visitChildren(ctx); 
    }
    
    @Override
    public Node visitFactor(FactorContext ctx){
        Node aux = null;
        if(ctx.power() != null){
            aux = visitPower(ctx.power());
            return  aux;
        }
        return visitChildren(ctx);
    }
    
    @Override
    public Node visitPower(PowerContext ctx){
        Node potencia = null;
        Node valor = visitAtom(ctx.atom());
        if(ctx.factor() != null){
            potencia = visitFactor(ctx.factor());
            if (potencia.getTipo() != ENTERO && potencia.getTipo() != FLOAT && potencia.getTipo()!= ID){
                // ERROR DE TIPOS
            }else{
                if(valor.getTipo() != ENTERO && valor.getTipo() != FLOAT && potencia.getTipo()!= ID){
                    // error tipos
                }else{
                    Check l = new Check();
                    if(l.validar(tablas, valor)){
                        
                    }
                    System.out.println("hola");
                    
               }
            }
        }
        return  visitChildren(ctx);
    }
    
    @Override 
    public Node visitTrailer(TrailerContext ctx) { 
        Node aux = null;
        if (ctx.NAME() != null){
            aux = new Node(ctx.NAME(), ID);
        }else if (ctx.subscriptlist() != null){
            aux = visitSubscriptlist(ctx.subscriptlist());
        }else if (ctx.arglist() != null){
            aux = visitArglist(ctx.arglist());
        }
        return aux; 
    }
    ///////////////////// tres para trailer
    @Override 
    public Node visitArglist(ArglistContext ctx) { 
        return visitChildren(ctx); 
    }
    
    @Override 
    public Node visitSubscriptlist(SubscriptlistContext ctx) {
        return visitChildren(ctx); 
    }
    
    @Override
    public Node visitArgument(ArgumentContext ctx) { 
        Node aux = null;
        if(ctx.test().size() == 1){                     /// verifia test (comp_for)
            //declara variable o pasa valor 
            return visitTest(ctx.test(0));
        }else{                                          //// verfica test '=' test
            Node nombre = visitTest(ctx.test(0));
            Node valor = visitTest(ctx.test(1));
            //añade a tablla ////////////////////////////////////////////////////
            //table.put(valor,nombre);
            String datos = "Argumrnt 2 opcion";
            aux.setDatos(datos);
            return aux;
         }
    }
    // en atom flata otras tres
    @Override
    public Node visitAtom(AtomContext ctx){
        Node aux = null;
        if(ctx.number()!= null){
            aux = visitNumber(ctx.number());
            return  aux;
        }if(ctx.strr().size() > 0){
            String linea = "";
            for(int i = 0; i < ctx.strr().size();i++){
                aux = visitStrr(ctx.strr(i));
                linea += aux.getDatos();
            }
            aux = visitStrr(ctx.strr(0));
            aux.setDatos(linea);
        }if(ctx.NAME() != null) {
            aux = new Node (ctx.NAME(), ID);
        }if(ctx.FALSE() != null){
            aux = new Node(ctx.FALSE(), FALSE);
        }if(ctx.TRUE() != null){
            aux = new Node(ctx.TRUE(), TRUE);
        }if(ctx.NONE() != null){
            aux = new Node(ctx.NONE(), NONE);
            
        }
        return aux;
    }
    
    @Override
    public Node visitNumber(NumberContext ctx){
        Node aux = null;
        if(ctx.FLOAT_NUMBER() != null){
            aux =  new Node(ctx.FLOAT_NUMBER(), FLOAT);
            return  aux;
        }if(ctx.IMAG_NUMBER() != null){
            aux = new Node (ctx.IMAG_NUMBER(), IMAG);
            return  aux;
        }if(ctx.integer() != null){
            aux = visitInteger(ctx.integer());
            //aux2.add(aux);
            return  aux;
        }
        return  visitChildren(ctx);
    }
    
    @Override 
    public Node visitInteger(IntegerContext ctx){
        Node aux = null;
        LinkedList<Node> aux2 = new LinkedList<Node>();
        if (ctx.BIN_INTEGER() != null){
            aux = new Node(ctx.BIN_INTEGER(), BINARIO);
        }else if(ctx.DECIMAL_INTEGER() != null){
            aux = new Node (ctx.DECIMAL_INTEGER(), ENTERO);
        }else if (ctx.HEX_INTEGER() != null){
            aux = new Node(ctx.HEX_INTEGER(), HEXA);
        }else if(ctx.OCT_INTEGER() != null){
            aux = new Node (ctx.OCT_INTEGER(), OCTAL);
        }
        return aux;
    }
    
    @Override 
    public Node visitStrr(StrrContext ctx) { 
        Node aux;
        if(ctx.BYTES_LITERAL() != null){
            aux = new Node(ctx.BYTES_LITERAL(), STRING);
        }else{
            aux = new Node(ctx.STRING_LITERAL(), STRING);
        }
        return aux; 
    }
    
}
