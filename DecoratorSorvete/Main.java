public class Main {
    public static void main(String[] args){
        Sorvete sorvete = new Cascao();
        System.out.println("Sorvete " + sorvete.getNome() + " = " + sorvete.getPreco());


        sorvete = new Cobertura(sorvete);
        System.out.println("Sorvete " + sorvete.getNome() + " = " + sorvete.getPreco());

        sorvete = new Granulado(sorvete);
        System.out.println("Sorvete " + sorvete.getNome() + " = " + sorvete.getPreco());
    }
}