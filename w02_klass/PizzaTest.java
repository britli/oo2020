/**
 * PizzaTest
 */
public class PizzaTest {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        Pizza pizza = new Pizza("Pepperoni", Width.PANNI, PizzaSize.PEREPIZZA, 11);
        Pizza pizza2 = new Pizza("Americano", Width.ÕHUKE, PizzaSize.VÄIKE, 4);
        Pizza pizza3 = new Pizza("Bolognese", Width.ÕHUKE, PizzaSize.SUUR, 7);


        Pizza[] pizzas = {pizza, pizza1, pizza2, pizza3};

        for(int i = 0; i < pizzas.length; i++){
            System.out.println(pizzas[i].getName());
            System.out.println(pizzas[i].getWidth());
            System.out.println(pizzas[i].getPizzaSize());
            System.out.println(pizzas[i].getPrice() + " EUROT");


        }
    }
}