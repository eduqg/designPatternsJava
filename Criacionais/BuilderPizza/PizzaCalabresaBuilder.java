public class PizzaCalabresaBuilder implements PizzaBuilder {
    Pizza pizza;

    public PizzaCalabresaBuilder(){
        pizza = new Pizza();
    }
    public void buildSabor() {
        pizza.setSabor("Calabreza");
    }
    public void buildBorda() {
        pizza.setBorda("Catupiry");
    }
    public Pizza getPizza() {
        return this.pizza;
    }
}