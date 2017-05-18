class main {



    public static void main(String[] args){
        FactoryPessoa factoryPessoa = new CriaHomem();
        Pessoa jose = factoryPessoa.criaPessoa("José");

        System.out.println(jose.getNome());
    }
}