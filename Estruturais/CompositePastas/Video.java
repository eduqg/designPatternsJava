public class Video implements Arquivo{
    private String nome;

    public Video(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
}