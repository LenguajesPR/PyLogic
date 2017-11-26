package Tools;

import Classes.PyLogic3Parser.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class Node {
    static final int ID =1,ENTERO=2,FLOAT=3,IMAG=4,BINARIO=5,HEXA=6,OCTAL=7,TRUE=8,FALSE=9,STRING=10,BITS=11,NONE=12,OTHER=13;
    
    int fila;
    int columna;
    int Tipo;
    String datos;

    public Node(int fila, int columna, String datos) {
        this.fila = fila;
        this.columna = columna;
        this.datos = datos;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public Node(TerminalNode nodo, int tipo) {
        this.fila = nodo.getSymbol().getLine();
        this.columna = nodo.getSymbol().getCharPositionInLine();
        this.datos = nodo.getSymbol().getText();
        this.Tipo = tipo;
        /*switch (tipo){
            case ID:
                this.Tipo = tipo;
                break;
            case ENTERO:
                this.Tipo = tipo;
                break;
            case FLOAT:
                this.Tipo = tipo;
                break;
            case IMAG:
                this.Tipo = tipo;
                break;
            case BINARIO:
                this.Tipo = tipo;
                break;
            case HEXA:
                this.Tipo = tipo;
                break;
            case OCTAL:
                this.Tipo = tipo;
                break;
            case TRUE:
                this.Tipo = tipo;
                break;
            case FALSE:
                this.Tipo = tipo;
                break;
            case STRING:
                this.Tipo = tipo;
                break;
            case BITS:
                this.Tipo = tipo;
                break;
            case NONE:
                this.Tipo = tipo;
                break;
            default:
                break;
        }*/
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Node{" + "fila=" + fila + ", columna=" + columna + ", datos=" + datos + '}';
    }
    
    public void print(){
        System.out.println(this.toString());
    }
}
