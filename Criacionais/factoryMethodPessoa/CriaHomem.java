public class CriaHomem implements FactoryPessoa{
    public Pessoa criaPessoa(String nome) {
        return new Homem(nome);
    }
}