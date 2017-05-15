public class Bandeira2 implements BandeiraState {
    public BandeiraState taxaBandeira1(){
        System.out.println("Está na bandeira 1 agora");
        return new Bandeira1();
    }
    public BandeiraState taxaBandeira2(){
        System.out.println("Ja esta na bandeira 2");
        return this;
    }
}