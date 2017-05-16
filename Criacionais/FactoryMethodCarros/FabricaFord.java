public class FabricaFord implements FabricaDeCarro {
    public Carro criarCarro(){
        return new FordTT();
    }
}