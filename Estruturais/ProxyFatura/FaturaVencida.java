public class FaturaVencida implements Fatura {

    private Fatura fatura;


    public FaturaVencida(Fatura fatura){
        this.fatura = fatura;
    }

    public void pagarFatura(double valor){
        double valorFaturaAtual = this.fatura.getValorFatura();
        double valorJurosAtual = this.fatura.getJuros();
        double taxaDeJuros = 0.2;

        if(valorJurosAtual == 0){
            this.fatura.setJuros(valorFaturaAtual * taxaDeJuros);
            this.fatura.setValorFatura(valorFaturaAtual + this.fatura.getJuros());
            System.out.println("Juros Adicionados!");
        } else {
            System.out.println("Essa fatura já possui juros");
        }
        System.out.println("1# Valor da Fatura: " + this.fatura.getValorFatura());
        System.out.println("2# Valor: " + valor);

        if(valor >= this.fatura.getValorFatura()){
            this.fatura.setPago(true);
            System.out.println("Fatura Vencida paga!");
        } else {
            System.out.println("Valor insuficiente para pagar a Fatura Vencida");
        }

    }

    public double getValorFatura(){
        return this.fatura.getValorFatura();
    }

    public void setValorFatura(double valor){
        this.fatura.setValorFatura(valor);
    }

    public boolean getPago(){
        return this.fatura.getPago();
    }

    public void setPago(boolean pago){
        this.fatura.setPago(pago);
    }

    public double getJuros(){
        return this.fatura.getJuros();
    }

    public void setJuros(double juros){
        this.fatura.setJuros(juros);
    }

}
