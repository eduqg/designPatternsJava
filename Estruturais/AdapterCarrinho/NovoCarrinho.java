public class NovoCarrinho {
    private int itens;

    public NovoCarrinho() {
        this.itens = 0;
    }
    public void compra(){
        this.itens = 0;
        System.out.println("Comprando tudo rápido!");
    }
    public void adiciona() {
        this.itens += 1;
        System.out.println("Produto adicionado rápido");
    }
    public void retira() {
        this.itens -= 1;
        System.out.println("Produto retirado rápido");
    }
    public int getItens() {
        return this.itens;
    }
}