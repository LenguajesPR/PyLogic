package Tools;

import java.util.HashMap;
import java.util.LinkedList;

public class Check {
    LinkedList<HashMap<Object,Object> > tablas = new LinkedList<>();
    HashMap<Object, Object> table = new HashMap<>();
    static final int ID =1,ENTERO=2,FLOAT=3,IMAG=4,BINARIO=5,HEXA=6,OCTAL=7,TRUE=8,FALSE=9,STRING=10,BITS=11,NONE=12,OTHER=13;
    
    public Object validar(Object tabla, Node nodo){
        tablas = (LinkedList<HashMap<Object,Object> >)tabla;
        for(int i = 0; i < tablas.size(); i++){
            table = tablas.get(i);
            if(table.get(nodo) != null){
                return table.get(nodo);
            }
        }
        /// return error
        return null;
    } 
    
    
       
}
