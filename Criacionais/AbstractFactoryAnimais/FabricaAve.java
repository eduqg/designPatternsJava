public class FabricaAve implements FabricaDeAnimais {
    public AnimalGrande criaGrande() {
        return new Avestruz();
    }
    public AnimalPequeno criaPequeno() {
        return new Passarinho();
    }
}