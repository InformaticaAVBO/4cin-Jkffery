public class Coppia<T, P> {
    private T int x;
    private P String s;

    public Coppia(int T x, String P s) {
        this.x = x;
        this.s = s;
    }

    public String toString() {
        return s + x;
    }
}