public class RealInternetAcess implements InternetAcess {
    private String funcionario;

    public RealInternetAcess(String funcionario) {
        this.funcionario = funcionario;
    }

    public void darAcesso() {
        System.out.println("Internet Access granted for employee: "+ funcionario);
    }
    public String getFuncionario() {
        return this.funcionario;
    }
}