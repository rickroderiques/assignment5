package za.ac.rick.Builder;

/**
 * Created by Rick on 03-Apr-16.
 */
public class HawaiiPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public HawaiiPizzaBuilder()
    {
        //create instance object Pizza
        pizza = new Pizza();
    }

    public void buildPizzaBase()
    {
        pizza.setPizzaBase("white dough");
    }

    public void buildPizzaSize()
    {
        pizza.setPizzaSize("large");
    }

    public void buildPizzaTopping()
    {
        pizza.setPizzaTopping("pineapples");
    }

    public Pizza getPizza()
    {
        return pizza;
    }

}
