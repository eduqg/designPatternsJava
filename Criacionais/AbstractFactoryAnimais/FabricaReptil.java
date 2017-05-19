public class FabricaReptil implements FabricaDeAnimais {
    public AnimalGrande criaGrande() {
        return new Jacare();
    }
    public AnimalPequeno criaPequeno() {
        return new Lagartixa();
    }
}