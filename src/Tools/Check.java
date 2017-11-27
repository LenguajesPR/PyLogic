package Tools;

import java.math.*;
import java.util.HashMap;
import java.util.LinkedList;

public class Check {
    LinkedList<HashMap<Object,Object> > tablas = new LinkedList<>();
    HashMap<Object, Object> table;
    static final int ID =1,ENTERO=2,FLOAT=3,IMAG=4,BINARIO=5,HEXA=6,OCTAL=7,TRUE=8,FALSE=9,STRING=10,BITS=11,NONE=12,OTHER=13;
    
    public Object validar(Object tabla, Node nodo){
        tablas = (LinkedList<HashMap<Object,Object> >)tabla;
        table.clear();
        for(int i = tablas.size()-1; i >=0; i--){
            table = tablas.get(i);
            if(table.get(nodo) != null){
                return table.get(nodo);
            }
        }
        /// return error
        return null;
    }
    
    public int exist(LinkedList<HashMap<Object,Object>> tabla, Node nodo){
        tablas = tabla;
        table.clear();
        for (int i = tablas.size()-1; i >=0; i--) {
            table = tablas.get(i);
            if(table.get(nodo) != null)return i;
        }
        return -1;
    }
    
    public Object checkType(LinkedList<HashMap<Object,Object>> tabla, Node nodo){
        int aux = nodo.Tipo;
        switch(aux){
            case ID:
                Node node = (Node)validar(tabla, nodo);
                if(node == null)return null;
                else if(Integer.parseInt(node.datos) == 0)return false;
                else return true;
            case ENTERO:
                if(Integer.parseInt(nodo.datos) == 0)return false;
                else return true;
            case BINARIO:
                if(Integer.parseInt(nodo.datos) == 0)return false;
                else return true;
            case OCTAL:
                if(Integer.parseInt(nodo.datos) == 0)return false;
                else return true;
            case HEXA:
                if(Integer.parseInt(nodo.datos) == 0)return false;
                else return true;
            case FALSE:
                return false;
            case NONE:
                return false;
            default:
                return true;
            }
    }
    
    public int integer(String num){
        switch (num.charAt(1)){
            case 'b':
                return valueOf(num.substring(2),2);
            case 'o':
                return valueOf(num.substring(2),8);
            case 'x':
                return valueOf(num.substring(2),16);
            default:
                return -1;
        }
    }
    
    private int valueOf(String num,int base){
        int ans = 0;
        for (int i = num.length()-1,j=0; i >=0; i--,j++) {
            int mult;
            if(num.charAt(i) == 'A' || num.charAt(i) == 'a')mult = 10;
            else if(num.charAt(i) == 'B' || num.charAt(i) == 'b')mult = 11;
            else if(num.charAt(i) == 'C' || num.charAt(i) == 'c')mult = 12;
            else if(num.charAt(i) == 'D' || num.charAt(i) == 'd')mult = 13;
            else if(num.charAt(i) == 'E' || num.charAt(i) == 'e')mult = 14;
            else if(num.charAt(i) == 'F' || num.charAt(i) == 'f')mult = 15;
            else mult = Integer.parseInt(num.charAt(i)+"");
            ans += mult*(Math.pow(base, j));
        }
        return ans;
    }
       
}
