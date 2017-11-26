package Classes;

import Classes.PyLogic3Parser.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;
import Tools.Node;

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
        return aux;
    }
    
    @Override 
    public Node visitExpr_stmt(PyLogic3Parser.Expr_stmtContext ctx) {
        Node aux = visitChildren(ctx);
        return aux;
    }
    
    @Override
    public Node visitFactor(FactorContext ctx){
        Node aux = null;
        if(ctx.power() != null){
            aux = visitPower(ctx.power());
        }
        return aux;
    }
    
    @Override
    public Node visitPower(PowerContext ctx){
        Node aux = null;
        if(ctx.atom() != null){
            aux = visitAtom(ctx.atom());
        }
        return aux;
    }
    
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
            aux =  new Node(ctx.FLOAT_NUMBER(),FLOAT);
            return  aux;
        }if(ctx.IMAG_NUMBER() != null){
            aux = new Node (ctx.IMAG_NUMBER(),IMAG);
            return  aux;
        }if(ctx.integer() != null){
            aux = visitInteger(ctx.integer());
            return  aux;
        }
        return  visitChildren(ctx);
    }
    
    @Override 
    public Node visitInteger(IntegerContext ctx){
        Node aux = null;
        if (ctx.BIN_INTEGER() != null){
            aux = new Node(ctx.BIN_INTEGER(),BINARIO);
        }else if(ctx.DECIMAL_INTEGER() != null){
            aux = new Node (ctx.DECIMAL_INTEGER(),ENTERO);
        }else if (ctx.HEX_INTEGER() != null){
            aux = new Node(ctx.HEX_INTEGER(),HEXA);
        }else if(ctx.OCT_INTEGER() != null){
            aux = new Node (ctx.OCT_INTEGER(),OCTAL);
        }
        return aux;
    }
    
}
