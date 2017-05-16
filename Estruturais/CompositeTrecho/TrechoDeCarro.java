public class TrechoDeCarro implements Trecho {
    private String direcao;
    private double distancia;

    public TrechoDeCarro(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }
    public void imprime() {
        System.out.println("Riders on the storm " + this.distancia + " quilômetros");
    }
}