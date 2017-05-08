public class FaturaPadrao implements Fatura {
	private double valorFatura;
	private double juros;
	private boolean pago;

	public FaturaPadrao(double valorPagaPagar){
		this.valorFatura = valorPagaPagar;
		this.pago = false;
		this.juros = 0;
	}

	public void pagarFatura(double valor){
		System.out.println("Valor da Fatura: " + this.valorFatura);
		if(valor >= this.valorFatura){
			setPago(true);
			System.out.println("Fatura Padrão paga!");
		} else {
			System.out.println("Valor insuficiente para pagar a Fatura Padrão");
		}
	}


	public double getValorFatura(){
		return this.valorFatura;
	}

	public void setValorFatura(double valor){
		this.valorFatura = valor;
    	}


	public boolean getPago(){
		return this.pago;
	}

	public void setPago(boolean pago){
		this.pago = pago;
	}

	public double getJuros(){
		return this.juros;
	}

	public void setJuros(double juros){
		this.juros = juros;
	}
}
