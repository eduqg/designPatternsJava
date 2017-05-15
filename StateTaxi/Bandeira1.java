public class Bandeira1 implements BandeiraState {
    public BandeiraState taxaBandeira1(){
        System.out.println("O taxi continua na bandeira 1");
        return this;
    }
    public BandeiraState taxaBandeira2(){
        System.out.println("Agora o Taxi esta na bandeira 2");
        return new Bandeira2();
    }
}