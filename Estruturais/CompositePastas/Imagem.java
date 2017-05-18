public class Imagem implements Arquivo{
    private String nome;

    public Imagem(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
}