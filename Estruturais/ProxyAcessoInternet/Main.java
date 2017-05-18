public class Main{
    public static void main(String[] args){
        RealInternetAcess normal = new RealInternetAcess("Eduardo");
        normal.darAcesso();
        RealInternetAcess normal2 = new RealInternetAcess("Ana");

        InternetAcess proxy = new ProxyInternetAcess(normal);
        proxy.darAcesso();
        InternetAcess proxy2 = new ProxyInternetAcess(normal2);
        proxy2.darAcesso();
    }
}