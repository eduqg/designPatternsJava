import java.util.*;

public class FabricaReptil extends TemplateExecucao implements FabricaDeAnimais  {
    private HashSet<AnimalReptilObserver> departamentos = new HashSet<AnimalReptilObserver>();
    public AnimalGrande criaGrande() {
        for(AnimalReptilObserver departamento : this.departamentos) {
            departamento.notifica();
            TemplateExecucao.executaRotinaRepteis();
        }
        return new Jacare();
    }
    public AnimalPequeno criaPequeno() {
        return new Lagartixa();
    }
    public void addIntrested(DepartamentoRepteis departamentoReptil) {
        departamentos.add(departamentoReptil);
    }
}