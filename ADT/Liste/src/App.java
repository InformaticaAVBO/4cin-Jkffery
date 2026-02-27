public class App {
    public static void main(String[] args) throws Exception {
        // crea una lista di stringhe con dati di prova, la manipola con i metodi presenti ed infine la stampa
        ListaOrdinata<String> l = new ListaOrdinata<>();
        l.add( v:"Mario" );
        l.add( v:"Luigi" );
        l.add( v:"Iris" );
        l.add( v:"Valerio" );
        l.add( v:"Giuseppe" );
        l.add( v:"Jeffery" );
        System.out.println(l);

        ListaOrdinata<Bici> lb = new ListaOrdinata<>();
        lb.add( v:new Bici( pollici: 24, Colori.BLU ) );
        lb.add( v:new Bici( pollici: 21, Colori.ROSSO ) );
        lb.add( v:new Bici( pollici: 22, Colori.BIANCO ) );
        lb.add( v:new Bici( pollici: 19, Colori.NERO ) );
        System.out.println(lb);
    }
}
