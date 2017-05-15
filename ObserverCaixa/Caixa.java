import java.util.*;

public class Caixa {
	private int numero;
	private boolean disponivel;

	private HashSet<CaixaObserver> painelInteressado = new HashSet<CaixaObserver>();

	public Caixa(int numero){
		this.numero = numero;
		this.disponivel = false;
	}

	public void registraPainel(Painel painel){
		this.painelInteressado.add(painel);
	}

	public void removePainel(Painel painel){
		this.painelInteressado.remove(painel);
	}

	public void setDisponivel(boolean disponibilidade){
		this.disponivel = disponibilidade;
		for(CaixaObserver painelInteressado : this.painelInteressado){
			painelInteressado.notifica(this);
		}
	}

	public int getNumero(){
		return this.numero;
	}

	public boolean getDisponivel(){
		return this.disponivel;
	}

}
