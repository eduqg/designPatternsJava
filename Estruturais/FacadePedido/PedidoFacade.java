public class PedidoFacade {
    private Financeiro financeiro;
    private Estoque estoque;

    public PedidoFacade(Financeiro financeiro, Estoque estoque) {
        this.financeiro = financeiro;
        this.estoque = estoque;
    }
    public void registraPedido(Pedido p) {
        this.estoque.enviaProduto(p.getProduto());
        this.financeiro.contabilizarProduto(p.getProduto());
    }
}