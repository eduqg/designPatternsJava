public class EmissorDecoradorComCriptografia extends EmissorDecorador {

	public EmissorDecoradorComCriptografia(Emissor emissor){
		super(emissor);
	}

	public void envia(String mensagem){
		System.out.println("Enviando mensagem com criptografia");
		this.getEmissor().envia(criptografa(mensagem));
	}

	private String criptografa(String mensagem){
		String mensagemCriptografada = "...";
		return mensagemCriptografada;
	}
}
