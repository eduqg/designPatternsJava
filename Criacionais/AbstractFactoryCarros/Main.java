public class Main {
    public static void main(String[] args){
        FabricaDeCarro fabricaFiat = new FabricaFiat();
        CarroSedan sedan = fabricaFiat.criarCarroSedan();
        sedan.exibirInfoSedan();

        CarroPopular popular = fabricaFiat.criarCarroPopular();
        popular.exibirInfoPopular();

    }
}