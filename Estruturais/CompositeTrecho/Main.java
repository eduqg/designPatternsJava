public class Main{
    public static void main(String[] args){
        Trecho trecho1 = new TrechoAndando("Caminhando ", 5);
        Trecho trecho2 = new TrechoDeCarro("De carro ", 10);

        Caminho caminho1 = new Caminho();
        caminho1.adiciona(trecho1);
        caminho1.adiciona(trecho2);
        System.out.println("Caminho 1:");
        caminho1.imprime();

        Caminho caminho2 = new Caminho();
        caminho2.adiciona(caminho1);
        caminho2.adiciona(trecho2);
        System.out.println("Caminho 2:");
        caminho2.imprime();
   }
}
