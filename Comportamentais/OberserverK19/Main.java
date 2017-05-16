public class Main {
	public static void main(String[] args){
		Acao acao = new Acao("VALE3", 45.42);

		Corretora corretora1 = new Corretora("Corretora1");
		Corretora corretora2 = new Corretora("Corretora2");

		acao.registraInteressados(corretora1);
		acao.registraInteressados(corretora2);

		acao.setValor(50);
	}

}
