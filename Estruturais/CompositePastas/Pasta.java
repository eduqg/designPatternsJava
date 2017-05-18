import java.util.*;

public class Pasta implements Arquivo {
    private String nome;
    private Set<Arquivo> arquivos = new HashSet<Arquivo>();

    public Pasta(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void adiciona(Arquivo arquivo) {
        this.arquivos.add(arquivo);
    }
    public void listaArquivos() {
        for(Arquivo arquivo : this.arquivos) {
            System.out.println(arquivo.getClass().getSimpleName());
        }
    }
}