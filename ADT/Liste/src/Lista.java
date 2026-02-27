/*
** Lista.java - Classe che rappresenta una lista collegata di nodi contenenti Stringhe.
** La lista supporta operazioni di aggiunta, rimozione, ricerca e verifica dell'esistenza di nodi.
*/

public class Lista {
    
    Nodo<String> root;
    
    public Lista() {
        root = null;
    }

    public boolean isEmpty() {
        return root==null;
    }

    public int getLength() {
        Nodo<String> tmp = root;
        int l = 0;
        while (tmp!=null) {
            l++;
            tmp = tmp.getNext();
        }
        return l;
    }

    public void add( String s ) {
        Nodo<String> n = new Nodo<>(s);
        addTail(n);
    }

    public void addHead( Nodo<String> n ) {
        Nodo<String> tmp = root;
        root = n;
        n.setNext(tmp);
    }

    public void addTail( Nodo<String> n ) {
        if (root==null) {
            root = n;
        } else {
            Nodo<String> temp = root;
            while (temp.getNext()!=null) temp=temp.getNext();
            temp.setNext(n);
        }
    }

    public boolean remove( String s ) {
        if (root==null) return false;
        if (root.getValue().equals(s)) {
            root = root.getNext();
            return true;
        }
        Nodo<String> tmp=root, succ=root.getNext();
        while (succ!=null) {
            if (succ.getValue().equals(s)) {
                tmp.setNext(succ.getNext());
                return true;
            }
            tmp=succ;
            succ=succ.getNext();
        } 
        return false;
    }

    public boolean exists( String s ) {
        Nodo<String> tmp = root;
        while (tmp!=null) {
            if (tmp.getValue().equals(s)) return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    public Nodo<String> find( String s ) {
        Nodo<String> tmp = root;
        while (tmp!=null) {
            if (tmp.getValue().equals(s)) return tmp;
            tmp = tmp.getNext();
        }
        return null;
    }

    public String toString() {
        String s = "La lista contiene: ";
        Nodo<String> temp = root;
        while (temp!=null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";
    }
}
