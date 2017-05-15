public abstract class SorveteDecorator extends Sorvete {
    Sorvete sorvete;

    public SorveteDecorator(Sorvete meuSorvete) {
        sorvete = meuSorvete;
    }

    @Override
    public String getNome() {
        return sorvete.getNome() + " = " + nome;
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + preco;
    }
}