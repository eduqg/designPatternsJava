public class Janela {
	private static Janela instanciaJanela;

	private Janela() {
	}

	public static Janela getInstance(){
		if(instanciaJanela == null)
			return new Janela();
		else
			return instanciaJanela;
	}

	public void abrir() {
		System.out.println("Abrindo a janela");
	}

	public void fechar() {
		System.out.println("Fechando a Janela");
	}
}
