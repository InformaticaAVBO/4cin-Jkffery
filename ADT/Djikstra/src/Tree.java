Public class Tree<T> {
    private Nodo<T> root;

    public Tree() {
        root = null;
    }

    public void add(T x) {
        Nodo<T> n = new Nodo<>(x);
        if (root == null) {
            root = new Nodo<>(x);
        } else {
            n.setRight(root)
            root = n;
        }
    }
    
}