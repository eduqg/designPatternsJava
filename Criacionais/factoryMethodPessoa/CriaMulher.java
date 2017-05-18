public class CriaMulher implements FactoryPessoa{
    public Pessoa criaPessoa(String nome) {
        return new Mulher(nome);
    }
}