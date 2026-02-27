public class ListaOrdinata<T extends Comparable<T>> {

    private Nodo<T> head;

    public void add(T v) {
        Nodo<T> n = new Nodo<>(v);

        if (head == null) {
            head = n;
            return;
        }

        if (head.getValue().compareTo(v) > 0) {
            // inserisco in testa
            n.setNext(head);
            head = n;
            return;
        }

        Nodo<T> temp = head;

        while (true) {
            if (temp.getNext() == null) {
                // inserisco in coda
                temp.setNext(n);
                return;
            }

            if (temp.getNext().getValue().compareTo(v) > 0) {
                // inserisco tra temp e il successivo
                n.setNext(temp.getNext());
                temp.setNext(n);
                break;
            }

            temp = temp.getNext();
        }
    }
}