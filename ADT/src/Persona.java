public class Persona {

    String nome, cognome;

    public Persona(String nome, Strin cognome) {
        this.nome = nome;
        this.cognome = cognome;

    }
    
    Public String getNome(){
        return nome;
    }

    
    Public String getCognome(){
        return cognome;
    }

    @Override
    public String toString(){
        return "Ayo, sono " + nome + " " + cognome;
    }
}