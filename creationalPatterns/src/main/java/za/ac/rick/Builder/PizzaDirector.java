package za.ac.rick.Builder;

/**
 * Created by Rick on 03-Apr-16.
 */
public class PizzaDirector {

    private PizzaBuilder pizzaBuilder = null;

    public PizzaDirector(PizzaBuilder pizzaBuilder)
    {
        this.pizzaBuilder = pizzaBuilder;
    }

    public  void constructPizza(){
        pizzaBuilder.buildPizzaBase();
        pizzaBuilder.buildPizzaSize();
        pizzaBuilder.buildPizzaTopping();
    }

    public Pizza getPizza()
    {
        return pizzaBuilder.getPizza();
    }
}
