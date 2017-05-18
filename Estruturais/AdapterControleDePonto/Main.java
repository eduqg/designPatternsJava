public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria");
        ControleDePonto controleAntigo = new ControleDePonto();
        controleAntigo.entra(funcionario);

        ControleDePontoAdapter controleNovo = new ControleDePontoAdapter();
        controleNovo.entra(funcionario);
    }
}