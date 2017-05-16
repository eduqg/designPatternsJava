public class TrechoAndando implements Trecho {
    private String direcao;
    private double distancia;

    public TrechoAndando(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }
    public void imprime() {
        System.out.println("Caminhando e cantando, e seguindo a cancao por " + this.distancia + " quilômetros");
    }
}