package za.ac.rick.Builder;

/**
 * Created by Rick on 03-Apr-16.
 */
public class SteakPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public SteakPizzaBuilder()
    {
        //create instance object Pizza
        pizza = new Pizza();
    }

    public void buildPizzaBase()
    {
        pizza.setPizzaBase("brown dough");
    }

    public void buildPizzaSize()
    {
        pizza.setPizzaSize("small");
    }

    public void buildPizzaTopping()
    {
        pizza.setPizzaTopping("steak pieces");
    }

    public Pizza getPizza()
    {
        return pizza;
    }


}
