public class Main {
    public static void main(String[] args) {
        FabricaDeAnimais fabricaReptil = new FabricaReptil();
        AnimalGrande jacare = fabricaReptil.criaGrande();
        jacare.fazBarulho();
    }
}