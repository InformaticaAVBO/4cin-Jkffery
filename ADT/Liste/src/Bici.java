public class Bici {


    int pollici;
    Colori colore;

    public Bici( int pollici, Colori colore ) {
        this.pollici = pollici;
        this.colore = colore;
    }

    public String toString() {
        return "Sono una bici da " + pollici + " pollici, di colore " + colore;
    }

    @override
    public int compareTo( Bici o ) {
        if (this.pollici < o.pollici) return -1;
        if (this.pollici > o.pollici) return 1;
        return 0;
    }
}