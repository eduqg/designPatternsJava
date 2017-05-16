public abstract class EmissorDecorador implements Emissor {

	private Emissor emissor;

	public EmissorDecorador(Emissor emissor){
		this.emissor = emissor;
	}

	public abstract void envia(String mensagem);

	public Emissor getEmissor(){
		return this.emissor;
	}

}
