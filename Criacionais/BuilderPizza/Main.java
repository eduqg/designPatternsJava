/* A customer ordering a pizza. */
public class Main {
    public static void main(String[] args) {
        PizzaBuilder calabresa = new PizzaCalabresaBuilder();

        Garcon garcon = new Garcon(calabresa);

        garcon.makePizza();

        Pizza firstPizza = garcon.getPizza();
        System.out.println(firstPizza.getSabor());


    }
}
