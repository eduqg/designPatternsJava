public class AdapterCarrinho extends Carrinho {
    private NovoCarrinho novoCarrinho;

    public AdapterCarrinho() {
        this.novoCarrinho = new NovoCarrinho();
    }
    public void compra(){
        this.novoCarrinho.compra();
    }
    public void adiciona() {
        this.novoCarrinho.adiciona();
    }
    public void retira() {
        this.novoCarrinho.retira();
    }
    public int getItens() {
        return this.novoCarrinho.getItens();
    }
}