public class DepartamentoRepteis implements AnimalReptilObserver {
    private String nome;

    public DepartamentoRepteis(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void notifica() {
        System.out.println("DepartamentoRepteis avisado");
    }
}