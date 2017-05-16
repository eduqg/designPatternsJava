public class Carrinho {
    private int itens;

    public Carrinho() {
        this.itens = 0;
    }
    public void compra(){
        this.itens = 0;
        System.out.println("Comprando tudo!");
    }
    public void adiciona() {
        this.itens += 1;
        System.out.println("Produto adicionado");
    }
    public void retira() {
        this.itens -= 1;
        System.out.println("Produto retirado");
    }
    public int getItens() {
        return this.itens;
    }
}