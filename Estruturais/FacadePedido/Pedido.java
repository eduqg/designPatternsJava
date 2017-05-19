public class Pedido {
    private String produto;

    public Pedido(String produto){
        this.produto = produto;
    }
    public String getProduto() {
        return this.produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
}