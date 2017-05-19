public class Garcon {
    private PizzaBuilder pizzaBuilder;

    public Garcon(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza getPizza() {
        return this.pizzaBuilder.getPizza();
    }
    public void makePizza() {
        pizzaBuilder.buildSabor();
        pizzaBuilder.buildBorda();
    }
}