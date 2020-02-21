/**
 * Pizza
 */
public class Pizza {

    private String name;
    private Width width;
    private PizzaSize pizzaSize;
    private int price;

    public Pizza(String name, Width width, PizzaSize pizzaSize, int price){
        this.name = name;
        this.width = width;
        this.pizzaSize = pizzaSize;
        this.price = price;
    }

    public Pizza(){
        name = "Margharita";
        width = Width.PANNI;
        pizzaSize = PizzaSize.SUUR;
        price = 6;
    }

    public String getName (){
        return name;
    }
    public String getWidth(){
        if(width == Width.PANNI){
            return "Panni";
        }else{
            return "Õhuke";
        }
    }
    public String getPizzaSize(){
        if(pizzaSize == PizzaSize.PEREPIZZA){
            return "Perepizza";
        }if(pizzaSize == PizzaSize.SUUR){
            return "Suur";
        }else{
            return "Väike";
        }
    }

    public int getPrice (){
        return price;
    }

}