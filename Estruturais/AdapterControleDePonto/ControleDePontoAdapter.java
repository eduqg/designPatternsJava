public class ControleDePontoAdapter extends ControleDePonto{
    public  ControleDePontoNovo controleNovo = new ControleDePontoNovo();

    public void entra(Funcionario funcionario) {
        controleNovo.entra(funcionario);
    }
    public void sai(Funcionario funcionario) {
        controleNovo.sai(funcionario);
    }
}