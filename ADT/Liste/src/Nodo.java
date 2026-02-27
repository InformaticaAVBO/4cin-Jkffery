/*
** Nodo.java - Classe che rappresenta un nodo di una lista collegata.
** Ogni nodo contiene un valore di tipo String e un riferimento al nodo successivo.
*/

public class Nodo<T> {
    
    private T value;
    private Nodo<T> next;
    
    public Nodo( T v ) {
        value = v;
        next = null;
    }

    public void setNext( Nodo<T> n ) { next = n; }    
    public Nodo<T> getNext() { return next; }    
    public void setValue( T v ) { value = v; }  
    public T getValue() { return value; }  

    public String toString() {
        return value == null ? "null" : value.toString();
    }
}
