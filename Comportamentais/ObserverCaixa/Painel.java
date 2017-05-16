public class Painel implements CaixaObserver {
	private String nome;

            public Painel(String nome){
                this.nome = nome;
            }

            public void notifica(Caixa caixa){
                System.out.println("Painel sendo notificado: " + this.nome);
                System.out.println("Caixa Alterado " + caixa.getNumero() + "para disponibilidade: " + caixa.getDisponivel());
            }

}
