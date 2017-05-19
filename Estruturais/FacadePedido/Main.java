/* A customer ordering a pizza. */
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Financeiro financeiro = new Financeiro();

        PedidoFacade facade = new PedidoFacade(financeiro,estoque);

        Pedido pedido = new Pedido("NovoPedido");

        facade.registraPedido(pedido);
    }
}
