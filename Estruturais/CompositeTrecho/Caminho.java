import java.util.*;

public class Caminho implements Trecho {
    private List<Trecho> trechos;

    public Caminho() {
        this.trechos = new ArrayList<Trecho>();
    }
    public void adiciona(Trecho maisTrecho) {
        this.trechos.add(maisTrecho);
    }
    public void remove(Trecho menosTrecho) {
        this.trechos.remove(menosTrecho);
    }
    public void imprime() {
        for(Trecho trecho : this.trechos) {
            trecho.imprime();
        }
    }
}