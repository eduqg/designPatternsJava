public class Pizza implements PizzaPlan {
    private String sabor;
    private String borda;

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void setBorda(String borda) {
        this.borda = borda;
    }
    public String getSabor() {
        return this.sabor;
    }
    public String getBorda() {
        return this.borda;
    }
}