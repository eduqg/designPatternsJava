public class Main {
    public static void main(String[] args){
        FabricaDeCarro fabricaFiat = new FabricaFiat();
        Carro carro1 = fabricaFiat.criarCarro();
        carro1.exibirInfomacoesDoCarro();

        FabricaDeCarro fabricaFord = new FabricaFord();
        Carro carro2 = fabricaFord.criarCarro();
        carro2.exibirInfomacoesDoCarro();

    }
}