public class DepartamentoAves {
    private String nome;

    public DepartamentoAves(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void notifica() {
        System.out.println("DepartamentoAves avisado");
    }
}