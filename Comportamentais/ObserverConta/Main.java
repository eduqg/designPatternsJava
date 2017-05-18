public class Main {
    public static void main(String[] args){
        Conta conta = new Conta("Eduardo", "1234");
        Jogador jogador = new Jogador("Edu");
        conta.addPlayerIntrested(jogador);

        Jogador jogador2 = new Jogador("Miguel");
        conta.addPlayerIntrested(jogador2);

        conta.login();
    }
}