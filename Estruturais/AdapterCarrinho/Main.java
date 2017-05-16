public class Main {
    public static void main(String args[]){
        Carrinho carrinhoAntigo = new Carrinho();
        carrinhoAntigo.adiciona();
        carrinhoAntigo.adiciona();
        carrinhoAntigo.retira();
        carrinhoAntigo.compra();

        Carrinho carrinhoAdaptado = new AdapterCarrinho();
        carrinhoAdaptado.adiciona();
        carrinhoAdaptado.adiciona();
        carrinhoAdaptado.retira();
        carrinhoAdaptado.compra();



    }
}