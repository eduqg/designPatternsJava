public class ProxyInternetAcess implements InternetAcess {
    private RealInternetAcess realInternetAcess;

    public ProxyInternetAcess(RealInternetAcess realInternetAcess) {
        this.realInternetAcess = realInternetAcess;
    }

    public void darAcesso() {
        if(this.realInternetAcess.getFuncionario() == "Eduardo") {
            System.out.println("Proxy Internet Access granted for employee: ");
        } else {
            System.out.println("Proxy Internet Access not granted for employee: ");
        }
    }

}