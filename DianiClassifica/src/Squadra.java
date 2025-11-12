package dianiclassifica;

public class Squadra {
    
    public int pos;
    public String nome;
    public int pg;
    public int pv;
    public int pp;

    public Squadra(int pos, String nome, int pg, int pv, int pp) {
        this.pos = pos;
        this.nome = nome;
        this.pg = pg;
        this.pv = pv;
        this.pp = pp;
    }
    
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    @Override
    public String toString() {
        return pos + "a     " + nome + "     " + pg + "      " + pv + "   -   " + pp;
    }
    
    
    
}
