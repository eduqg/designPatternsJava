public class Main{
    public static void main(String[] args){
	String mensagem = "abc";
	Emissor emissor = new EmissorBasico();
	emissor.envia("Minha mensagem\n\n");

	emissor = new EmissorDecoradorComCriptografia(new EmissorBasico());
	emissor.envia(mensagem);	
	
   }
}
