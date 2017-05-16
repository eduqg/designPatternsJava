public class Main {
        public static void main(String[] args){
                Painel painel = new Painel("Painel 1");
                Painel painel2= new Painel("Painel 2");

                Caixa caixa1 = new Caixa(1);
                Caixa caixa2 = new Caixa(2);

                caixa1.registraPainel(painel);
                caixa2.registraPainel(painel);

                caixa2.registraPainel(painel2);

                caixa1.setDisponivel(true);
                caixa2.setDisponivel(false);
                caixa1.setDisponivel(false);
                caixa1.setDisponivel(true);

        }
}