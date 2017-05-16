public class Taxi {
    BandeiraState estado;

    public Taxi(){
        estado = new Bandeira1();
    }

    public void bandeira1(){
        estado = estado.taxaBandeira1();
    }

    public void bandeira2(){
        estado = estado.taxaBandeira2();
    }
}