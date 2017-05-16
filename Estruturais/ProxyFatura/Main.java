public class Main{
    public static void main(String[] args){
        System.out.println("Pagamento de uma Fatura Padrão");
        double valorParaPagar = 1000;
        FaturaPadrao faturaPadrao = new FaturaPadrao(valorParaPagar);
        faturaPadrao.pagarFatura(900);
        System.out.println("A conta foi paga? " + faturaPadrao.getPago() + "\n");
        faturaPadrao.pagarFatura(1000);
        System.out.println("A conta foi paga? " + faturaPadrao.getPago()+ "\n");

        System.out.println("Pagamento de uma Fatura com Juros");
        double novoValorParaPagar = 1000;

        FaturaPadrao novaFaturaPadrao = new FaturaPadrao(novoValorParaPagar);
        FaturaVencida faturaVencida = new FaturaVencida(novaFaturaPadrao);

        faturaVencida.pagarFatura(1000);
        System.out.println("A conta foi paga? " + faturaVencida.getPago() + "\n");
        faturaVencida.pagarFatura(1100);
        System.out.println("A conta foi paga? " + faturaVencida.getPago() + "\n");
        faturaVencida.pagarFatura(1200);
        System.out.println("A conta foi paga? " + faturaVencida.getPago() + "\n");
    }
}