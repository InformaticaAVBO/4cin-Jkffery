public abstract class Timido extends Personcina {

    public Timido(String nome, int eta, int altezza) {
        super(nome, eta, altezza);
    }
    
    @Override
    public void offenditi() {
        System.out.println("Dai, smettila...");
    }
    
}
