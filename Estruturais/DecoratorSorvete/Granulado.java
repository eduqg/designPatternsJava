public class Granulado extends SorveteDecorator {
    public Granulado(Sorvete meuSorvete) {
        super(meuSorvete);
        nome = "Granulado";
        preco = 0.2;
    }
}