package Tools;

import java.util.HashMap;
import java.util.LinkedList;

public class Check {
    LinkedList<HashMap<Object,Object> > tablas = new LinkedList<>();
    HashMap<Object, Object> table = new HashMap<>();
    
    public boolean validar(Object tabla, Node nodo){
        tablas = (LinkedList<HashMap<Object,Object> >)tabla;
        for(int i = 0; i < tablas.size(); i++){
            table = tablas.get(i);
            if(table.get(nodo) != null){
                return true;
            }
        }
        /// return error
        return false;
    } 
    
    public Check() {
    }
        
}
