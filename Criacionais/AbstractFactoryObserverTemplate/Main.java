public class Main {
    public static void main(String[] args) {
        FabricaDeAnimais fabricaReptil = new FabricaReptil();
        DepartamentoRepteis reptilObserver = new DepartamentoRepteis("IBAMA");
        fabricaReptil.addIntrested(reptilObserver);

        AnimalGrande jacare = fabricaReptil.criaGrande();
        jacare.fazBarulho();

    }
}