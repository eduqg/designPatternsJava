public class Jogador implements ContaObserver {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void notifica() {
        System.out.println("A conta foi acessada");
    }
}