package Classes;

import Classes.PyLogic3Parser.*;
import java.util.*;
import Tools.*;
import java.math.*;

public class PyLogicVisitor<T> extends PyLogic3BaseVisitor<Node>  {
    static final int ID =1,ENTERO=2,FLOAT=3,IMAG=4,BINARIO=5,HEXA=6,OCTAL=7,TRUE=8,FALSE=9,STRING=10,BITS=11,NONE=12,OTHER=13;
    
    LinkedList<HashMap<Object,Object> > tablas = new LinkedList<>();
    HashMap<Object, Object> table = new HashMap<>();
    HashMap<Object, Object> temp;
    
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
        Check l = new Check();
        if(ctx.testlist_star_expr().size()==1){
            return aux;
        }else{
            Node nombre = visitTestlist_star_expr(ctx.testlist_star_expr(0));
            Node valor = visitTestlist_star_expr(ctx.testlist_star_expr(ctx.testlist_star_expr().size()-1));
            LinkedList<Node> listaTestList = new LinkedList<Node>();
            for(int i = 0; i < ctx.testlist_star_expr().size()-1;i++){
                aux = visitTestlist_star_expr(ctx.testlist_star_expr(i));
                int lugar = tablas.size()-1;
                int ubi = l.exist(tablas, aux);
                if(ubi != -1){
                    lugar = ubi;
                } 
                if(aux.getTipo() == ID){
                    tablas.get(lugar).put(aux, valor);
                }else{
                    System.err.println("error de asignacion");
                    System.exit(0);
                }
            }
        }
        
        //System.out.println(ctx.getText());
        //System.out.println();
        return aux;
    }
    
    @Override
    public Node visitCompound_stmt(Compound_stmtContext ctx){
        Node aux = null;
        if(ctx.if_stmt() != null){
            visitIf_stmt(ctx.if_stmt());
        }if(ctx.while_stmt() != null){
            visitWhile_stmt(ctx.while_stmt());
        }if(ctx.for_stmt() != null){
            visitFor_stmt(ctx.for_stmt());
        }if(ctx.try_stmt() != null){
            visitTry_stmt(ctx.try_stmt());
        }if(ctx.with_stmt() != null){
            visitWith_stmt(ctx.with_stmt());
        }if(ctx.funcdef() != null){
            visitFuncdef(ctx.funcdef());
        }if(ctx.classdef() != null){
            visitClassdef(ctx.classdef());
        }if(ctx.decorated() != null){
            visitDecorated(ctx.decorated());
        }
        return aux;
    }
    
    @Override
    public Node visitIf_stmt(If_stmtContext ctx){
        Node aux = null;
        boolean Else = true;
        //System.out.println(ctx.test().size());
        for (int i = 0; i < ctx.test().size() ; i++) {
            Check aux2 = new Check();
            Node nodo = visitTest(ctx.test(i));
            try{
                if((Boolean)aux2.checkType(tablas, nodo)){
                    visitSuite(ctx.suite(i));
                    Else = false;
                    break;
                }
            }catch(Exception e){
                System.err.printf("<%i,%i>ERROR:::La variable %s no ha sido declarada",nodo.getFila(),nodo.getColumna(),nodo.getDatos());
                System.exit(0);
            }
        }if(ctx.ELSE() != null && Else){
            visitSuite(ctx.suite(ctx.suite().size()-1));
        }
        return aux;
    }
    
    @Override
    public Node visitWhile_stmt(While_stmtContext ctx){
        Node aux = null;
        Check aux2 = new Check();
        Node nodo = visitTest(ctx.test());
        try {
            if ((Boolean) aux2.checkType(tablas, nodo)) {
                visitSuite(ctx.suite(0));
            }
        } catch (Exception e) {
            System.err.printf("<%i,%i>ERROR:::La variable %s no ha sido declarada", nodo.getFila(), nodo.getColumna(), nodo.getDatos());
            System.exit(0);
        }if(ctx.ELSE() != null){
            visitSuite(ctx.suite(1));
        }
        return aux;
    }
    
    @Override
    public Node visitFor_stmt(For_stmtContext ctx){
        Node aux = null;
        Check val = new Check();
        Node exprlist = visitExprlist(ctx.exprlist());
        Node testlist = visitTestlist(ctx.testlist());
        if(exprlist.getTipo() == ID && testlist.getTipo() == ENTERO){
            int index;
            for (int i = 0; i < Integer.parseInt(testlist.getDatos()); i++) {
                index = val.exist(tablas, exprlist);
                if (index != -1) {
                    aux = (Node) tablas.get(index).get(exprlist);
                    aux.setDatos(String.valueOf(i));
                    aux.setTipo(ENTERO);
                } else {
                    tablas.get(tablas.size() - 1).put(exprlist, testlist);
                }visitSuite(ctx.suite(0));
            }
        }if(ctx.ELSE() != null){
            visitSuite(ctx.suite(1));
        }
        return aux;
    }
    
    @Override
    public Node visitSuite(SuiteContext ctx){
        Node aux = null;
        tablas.add(new HashMap<>());
        if(ctx.simple_stmt() != null){
            visitSimple_stmt(ctx.simple_stmt());
        }else{
            for (int i = 0; i < ctx.stmt().size(); i++) {
                visitStmt(ctx.stmt(i));
            }
        }tablas.remove(tablas.size()-1);
        return aux;
    }
    
    @Override 
    public Node visitTest(TestContext ctx) { 
        return visitChildren(ctx); 
    }
    
    @Override 
    public Node visitPrint(PyLogic3Parser.PrintContext ctx) {
        Check l = new Check();
        Node aux = visitExpr_stmt(ctx.expr_stmt());
        Node valor = (Node)l.validar2(tablas,aux);
        System.out.println(valor.getDatos());
        return visitChildren(ctx); 
    }
    
    @Override
    public Node visitComparison(PyLogic3Parser.ComparisonContext ctx) { 
        //System.out.println(visitStar_expr(ctx.star_expr(0)).getDatos());
        if(ctx.star_expr().size() == 1){
            return visitStar_expr(ctx.star_expr(0));
        }else{
            Check l = new Check();
            int tipo = 0;
            Node valor = visitStar_expr(ctx.star_expr(0));
            Node primer = valor;
            String v= "";
            double v2 = 0;
            if(valor.getTipo() == STRING){
                tipo = STRING;
                v = valor.getDatos();
            }else if(valor.getTipo() == ENTERO || valor.getTipo() == FLOAT){
                tipo = ENTERO;
                v2 = Double.parseDouble(valor.getDatos());
            }else if(valor.getTipo() == ID){
                Node aux = (Node)l.validar(tablas, valor);
                if(aux.getTipo() == ENTERO || aux.getTipo() == FLOAT){
                    tipo = ENTERO;
                    v2 = Double.parseDouble(valor.getDatos());
                }else if(aux.getTipo() == STRING){
                    tipo = STRING;
                    v = valor.getDatos();
                }
            }else{
                //error tipo
            }
            int cont = 1;
            boolean tot = true;
            for(int i = 0; i < ctx.comp_op().size(); i++){
                Node aux;
                valor = visitStar_expr(ctx.star_expr(cont));
                cont++;
                aux = (Node)l.nodo(tablas, valor);
                if (tipo == ENTERO && aux.getTipo() == ENTERO && tot){
                    double k = Double.parseDouble(aux.getDatos());
                    //System.out.println(ctx.comp_op(i).getText());
                    tot = l.evaluarI(v2,k,ctx.comp_op(i).getText());
                    v2 = k;
                    if(tot == false){
                        //System.out.println(tot);
                        primer.setDatos("False");
                        primer.setTipo(FALSE);    
                        return primer;
                    }
                }else if(tipo == STRING && aux.getTipo() == STRING && tot){
                    String k = aux.getDatos();
                    tot = l.evaluarS(v,k,ctx.comp_op(i).getText());
                    v = k;
                    
                    if(tot == false){
                        //System.out.println(tot);
                        primer.setDatos("False");
                        primer.setTipo(FALSE);
                        return primer;
                    }
                }else{
                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                    System.exit(0);
                    return null;
                }
            }
            
            primer.setDatos("True");
            primer.setTipo(TRUE);
            //System.out.println(primer.getDatos());
            return primer;
        }
    }
    
    @Override
    public Node visitShift_expr(PyLogic3Parser.Shift_exprContext ctx) { 
        if(ctx.arith_expr().size() == 1){
            return visitArith_expr(ctx.arith_expr(0));
        }else{
            Node valor = null;
            Node aux;
            Check l = new Check();
            int op = 0;
            boolean valido = l.validarTipos(visitArith_expr(ctx.arith_expr(0))); // entero o ID
            if(valido){
                valor = visitArith_expr(ctx.arith_expr(0));
                if(valor.getTipo() == ID){
                    aux = (Node)l.validar(tablas, valor);
                }else{
                    aux = valor;
                }
                op = Integer.parseInt(aux.getDatos());
            }
            int cont = 1; 
            for(int i = 0; i < ctx.getText().length();i++){
                if(ctx.getText().charAt(i)=='<' && ctx.getText().charAt(i+1)=='<'){
                    valido = l.validarTipos(visitArith_expr(ctx.arith_expr(cont))); // entero o ID
                    if(valido){
                        valor = visitArith_expr(ctx.arith_expr(cont));
                        if(valor.getTipo() == ID){
                            aux = (Node)l.validar(tablas, valor);
                        }else{
                            aux = valor;
                        }
                        int des = Integer.parseInt(aux.getDatos()); 
                        System.out.println(op+" "+des);
                        op = op << des; 
                    }
                    cont++;
                }else if(ctx.getText().charAt(i)=='>' && ctx.getText().charAt(i+1)=='>'){
                    valido = l.validarTipos(visitArith_expr(ctx.arith_expr(cont))); // entero o ID
                    if(valido){
                        valor = visitArith_expr(ctx.arith_expr(cont));
                        if(valor.getTipo() == ID){
                            aux = (Node)l.validar(tablas, valor);
                        }else{
                            aux = valor;
                        }
                        int des = Integer.parseInt(aux.getDatos()); 
                        op = op >> des; 
                    }
                    cont++;
                }
            }
            valor.setDatos(String.valueOf(op));
            //System.out.println(valor.getDatos());
            return valor;
        }
    }
    
    @Override 
    public Node visitArith_expr(Arith_exprContext ctx) { 
        if(ctx.term().size() == 1){
            return visitTerm(ctx.term(0));
        }else{
            double val = 0;
            String va  = "";
            Node valor = visitTerm(ctx.term(0));
            Check l = new Check();
            Node u = (Node)l.validar(tablas, valor);
            int aux = 0;
            if(u != null){
                if(u.getTipo()==STRING){
                    aux = 1;
                }
            }
            if((valor.getTipo() == ENTERO || valor.getTipo() == FLOAT || valor.getTipo() == ID) && aux ==0 ){
                if(valor.getTipo() != ID){
                    val = Double.parseDouble(valor.getDatos());
                    //System.out.println(val);
                }else{
                    
                    u = (Node)l.validar(tablas, valor);
                    if(u != null){
                        if (( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                            double k = Double.parseDouble( u.getDatos());
                            //System.out.println(k);
                            val = k;
                            //System.out.println(k);                
                            //u.setDatos(String.valueOf(k));
                        }else{
                            System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                            System.exit(0);
                        }
                    }else{
                        System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Variable no delcarada");
                        System.exit(0);
                    }
                }
            }else if(valor.getTipo() == STRING || valor.getTipo() == ID){
                if(valor.getTipo() != ID){
                    va = valor.getDatos();
                    aux = 1;
                }else {
                     l = new Check();
                    u = (Node)l.validar(tablas, valor);
                    if(u != null){
                        if (( u.getTipo() == STRING )){
                            va = u.getDatos();
                            aux = 1;
                        }else{
                            System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                            System.exit(0);
                        }
                    }else{
                        System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: variable no declarada");
                        System.exit(0);
                    }
                }
            }
            int cont = 1;
            //System.out.println(val);
            for(int i = 0; i < ctx.getText().length(); i++){
                if(ctx.getText().charAt(i) == '+'){
                    valor = visitTerm(ctx.term(cont));
                    if((valor.getTipo() == ENTERO || valor.getTipo() == FLOAT || valor.getTipo() == ID)&& aux == 0){
                        if(valor.getTipo() != ID){
                            val += Double.parseDouble(valor.getDatos());
                        }else{
                            
                             u = (Node)l.validar(tablas, valor);
                            if(u != null){
                                if (( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                                    double k = Double.parseDouble( u.getDatos());
                            //System.out.println(k);
                                    val += k;
                            //System.out.println(k);                
                            //u.setDatos(String.valueOf(k));
                                }else{
                                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                                    System.exit(0);
                                }
                            }else{
                                System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Variable no declarado");
                                System.exit(0);
                            }
                        }
                    }else if(valor.getTipo() == STRING || valor.getTipo() == ID){
                        if(valor.getTipo() != ID){
                            va += valor.getDatos();
                            //System.out.println(va);
                        }else {
                            
                            u = (Node)l.validar(tablas, valor);
                            if(u != null){
                                if (( u.getTipo() == STRING )){
                                    va += u.getDatos();
                                }else{
                                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: variable no declarada");
                                    System.exit(0);
                                }
                            }else{
                                System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                                System.exit(0);
                            }
                        }
                    }
                    cont++;
                }else if(ctx.getText().charAt(i) == '-'){
                    valor = visitTerm(ctx.term(cont));
                    if((valor.getTipo() == ENTERO || valor.getTipo() == FLOAT || valor.getTipo() == ID)&& aux == 0){
                        if(valor.getTipo() != ID){
                            val -= Double.parseDouble(valor.getDatos());
                        }else{
                            l = new Check();
                             u = (Node)l.validar(tablas, valor);
                            if(u != null){
                                if (( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                                    double k = Double.parseDouble( u.getDatos());
                                    val -= k;
                                }else{
                                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                                    System.exit(0);
                                }
                            }else{
                                System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: "+" Vaiablr no drfinida");
                                System.exit(0);
                            }
                        }
                    }else{
                        System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                        System.exit(0);
                    }
                    cont++;
                }
            }
            if(aux == 0){
                valor.setDatos(String.valueOf(val));
                //System.out.println(val);
            }else{
                valor.setDatos(va);
                String[] y = va.split("\"");
                String p = "";
                for(int r = 0; r < y.length;r++){p+=y[r];}
                //System.out.println(p);
            }
            //System.out.println(valor.getDatos());
            return valor;
        }
    }
    
    
    @Override 
    public Node visitTerm(TermContext ctx) { 
        if(ctx.factor().size()==1){
            return visitFactor(ctx.factor(0));
        }else{
            double val=0;
            Node valor = visitFactor(ctx.factor(0));
            Node aux = null;
            if(valor.getTipo() == ENTERO || valor.getTipo() == FLOAT || valor.getTipo() == ID){
                if(valor.getTipo() != ID){
                    val = Double.parseDouble(valor.getDatos());
                }else{
                    Check l = new Check();
                    Node u = (Node)l.validar(tablas, valor);
                    if(u != null){
                        if (( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                            double k = Double.parseDouble( u.getDatos());
                            //System.out.println(k);
                            val = k;
                            //System.out.println(k);                
                            //u.setDatos(String.valueOf(k));
                        }else{
                            System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                            System.exit(0);
                        }
                    }else{
                        System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: variable no declarada");
                        System.exit(0);
                    }
                }
            }
            int cont = 1;
            String linea = ctx.getText();
            for(int i =0; i < ctx.getText().length();i++){
                if(linea.charAt(i) == '/' && linea.charAt(i+1) != '/' && linea.charAt(i-1) != '/'){
                    valor = visitFactor(ctx.factor(cont));
                    //aux = null;
                    if(valor.getTipo() == ENTERO || valor.getTipo() == FLOAT || valor.getTipo() == ID){
                        if(valor.getTipo() != ID){
                            val /= Double.parseDouble(valor.getDatos());
                        }else{
                            Check l = new Check();
                            Node u = (Node)l.validar(tablas, valor);
                            if(u != null){
                                if (( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                                    double k = Double.parseDouble( u.getDatos());
                                    val /= k;
                                }else{
                                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                                    System.exit(0);
                                }
                            }else{
                                System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: variable no declarada");
                                System.exit(0);
                            }
                        }
                    }
                    cont++;
                }else if(linea.charAt(i) == '*' && linea.charAt(i+1) != '*'&& linea.charAt(i-1) != '*'){
                    valor = visitFactor(ctx.factor(cont));
                    //aux = null;
                    //System.out.println("hola");
                    if(valor.getTipo() == ENTERO || valor.getTipo() == FLOAT || valor.getTipo() == ID){
                        if(valor.getTipo() != ID){
                            val *= Double.parseDouble(valor.getDatos());
                        }else{
                            Check l = new Check();
                            Node u = (Node)l.validar(tablas, valor);
                            if(u != null){
                                if (( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                                    double k = Double.parseDouble( u.getDatos());
                                    val *= k;
                                }else{
                                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                                    System.exit(0);
                                }
                            }else{
                                System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: variable no declarada");
                                System.exit(0);
                            }
                        }
                    }
                    cont++;
                }else if(linea.charAt(i) == '%'){
                    valor = visitFactor(ctx.factor(cont));
                    //aux = null;
                    if(valor.getTipo() == ENTERO || valor.getTipo() == FLOAT || valor.getTipo() == ID){
                        if(valor.getTipo() != ID){
                            //val = Double.parseDouble(valor.getDatos());
                            double k = Double.parseDouble( valor.getDatos());
                            double v = val;
                            val = v % k;
                        }else{
                            Check l = new Check();
                            Node u = (Node)l.validar(tablas, valor);
                            if(u != null){
                                if (( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                                    double k = Double.parseDouble( u.getDatos());
                                    double v = val;
                                    val = v % k;
                                }else{
                                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                                    System.exit(0);
                                }
                            }else{
                                //no declarada
                                System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: variable no declarada");
                                System.exit(0);
                            }
                        }
                    }
                    cont++;
                }else if(linea.charAt(i) == '/' && linea.charAt(i+1) == '/'){
                    valor = visitFactor(ctx.factor(cont));
                    //aux = null;
                    if(valor.getTipo() == ENTERO || valor.getTipo() == FLOAT || valor.getTipo() == ID){
                        if(valor.getTipo() != ID){
                            val /= (int)Double.parseDouble(valor.getDatos());
                        }else{
                            Check l = new Check();
                            Node u = (Node)l.validar(tablas, valor);
                            if(u != null){
                                if (( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                                    double k = Double.parseDouble( u.getDatos());
                                    int j = (int)(k);
                                    val = Math.floor(val/ k) ;
                                }else{
                                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                                    System.exit(0);
                                }
                            }else{
                                System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: variable no declarada");
                                System.exit(0);
                            }
                        }
                    }
                    cont++;
                }
            }
            //System.out.println(val);
        }
        return visitChildren(ctx); 
    }
    
    @Override
    public Node visitFactor(FactorContext ctx){
        Node aux = null;
        //System.out.println(ctx.power().getText());
        if(ctx.power() != null){
            aux = visitPower(ctx.power());
            return  aux;
        }else{
            aux = visitFactor(ctx.factor());
            String linea = ctx.getText();
            if(linea.charAt(0)=='-' && (aux.getTipo() == ENTERO || aux.getTipo() == FLOAT)){   
                double k = Double.parseDouble( aux.getDatos());
                k = k*-1;
                aux.setDatos(String.valueOf(k));
            }else if(linea.charAt(0) == '~' && (aux.getTipo() == FALSE || aux.getTipo() == TRUE)){
                if(aux.getTipo() == FALSE){
                    aux.setTipo(TRUE);
                    aux.setDatos("True");
                }else{
                    aux.setTipo(FALSE);
                    aux.setDatos("Flase");
                }
            }else if(aux.getTipo() == ID){
                Check l = new Check();
                Node u = (Node)l.validar(tablas, aux);
                if(u != null){
                    if (linea.charAt(0)=='-'&&( u.getTipo() == ENTERO || u.getTipo() == FLOAT)){
                        double k = Double.parseDouble( u.getDatos());
                        //System.out.println(k);
                        k = k*-1;
                        //System.out.println(k);                
                        u.setDatos(String.valueOf(k));
                    }else if (linea.charAt(0) == '~' && (u.getTipo() == FALSE || u.getTipo() == TRUE)){
                        if(u.getTipo() == FALSE){
                            //System.out.println(u.getTipo());
                            u.setTipo(TRUE);
                            u.setDatos("True");
                            //System.out.println(u.getTipo());
                        }else{
                            u.setTipo(FALSE);
                            u.setDatos("False");
                        }
                    }else{
                        System.err.println("<"+aux.getFila()+","+aux.getColumna()+">ERROR::: Incompativilidad de tipos");
                        System.exit(0);
                    }
                }else{
                    System.err.println("<"+aux.getFila()+","+aux.getColumna()+">ERROR::: Variable no declarada");
                    System.exit(0);
                }

            }
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
                System.err.println("<"+potencia.getFila()+","+potencia.getColumna()+">ERROR::: Incompativilidad de tipos");
                System.exit(0);
            }else{
                if(valor.getTipo() != ENTERO && valor.getTipo() != FLOAT && valor.getTipo()!= ID){
                    System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                    System.exit(0);
                }else{
                    
                    Check l = new Check(); 
                    Node b = null;
                    Node p = null;
                    if(valor.getTipo() == ID){
                        b = ((Node)l.validar(tablas, valor));
                        //System.out.println(valor);
                        //System.out.println(tablas.get(0).get(valor));
                    }else{
                        b = valor;
                    }
                    if(potencia.getTipo() == ID){
                        p = ((Node)l.validar(tablas, potencia));
                    }else{
                        p = potencia;
                    }
                    if(b != null && p != null){
                        double b1 = Double.parseDouble(b.getDatos());
                        double p1 = Double.parseDouble(p.getDatos());
                        double total = Math.pow(b1, p1);
                        //System.out.println(total);
                        String T = String.valueOf(total);
                        valor.setDatos(T);
                    }else{
                        if(b == null){
                            System.err.println("<"+valor.getFila()+","+valor.getColumna()+">ERROR::: Incompativilidad de tipos");
                            System.exit(0);
                        }else{
                            System.err.println("<"+potencia.getFila()+","+potencia.getColumna()+">ERROR::: Incompativilidad de tipos");
                            System.exit(0);
                        }
                    }
                    return valor;
                }
            }
        }else{
            return valor;
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
        Check l = new Check();
        LinkedList<Node> aux2 = new LinkedList<Node>();
        if (ctx.BIN_INTEGER() != null){
            aux = new Node(ctx.BIN_INTEGER(), ENTERO);
            aux.setDatos(String.valueOf(l.integer(aux.getDatos())));
        }else if(ctx.DECIMAL_INTEGER() != null){
            aux = new Node (ctx.DECIMAL_INTEGER(), ENTERO);
        }else if (ctx.HEX_INTEGER() != null){
            aux = new Node(ctx.HEX_INTEGER(), ENTERO);
            aux.setDatos(String.valueOf(l.integer(aux.getDatos())));
        }else if(ctx.OCT_INTEGER() != null){
            aux = new Node (ctx.OCT_INTEGER(), ENTERO);
            aux.setDatos(String.valueOf(l.integer(aux.getDatos())));
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
    
    @Override
    public Node visitFact(FactContext ctx){
        Node aux = null;
        ArrayList<Node> fact = new ArrayList<>();
        ArrayList<ArrayList<Node>> facts = new ArrayList<>();
        List<TestContext> tests ;
        int capacidad = ctx.log_line(0).test().size();
        List<Log_lineContext> log_stmt = ctx.log_line();
        for (int i = 0; i < log_stmt.size(); i+=2) {
            fact.clear();
            tests = log_stmt.get(i).test();
            if(tests.size() == capacidad){
                for (int j = 0; j < tests.size(); j++) {
                    aux = visitTest(tests.get(j));
                    fact.add(aux);
                }
                facts.add(fact);
            }else{
                System.err.printf("ERROR:::Numero invalido de parametros en los hechos \n",capacidad);
                System.exit(0);
            }
        }tablas.get(tablas.size()-1).put(ctx.NAME(), facts);
        return aux;
    }
    
    @Override
    public Node visitRules(RulesContext ctx){
        Node aux = null;
        tablas.get(tablas.size()-1).put(ctx.NAME(),ctx);
        return aux;
    }
    
    @Override
    public Node visitConsult(ConsultContext ctx){
        Node aux = null;
        List<TestContext> tests = ctx.test();
        LinkedList<Node> op_bins = new LinkedList<>();
        for (int i = 0; i < ctx.OP_BIN().size(); i++) {
            op_bins.add(new Node(ctx.OP_BIN(i),OTHER));
        }
        
        return aux;
    }
    
}
