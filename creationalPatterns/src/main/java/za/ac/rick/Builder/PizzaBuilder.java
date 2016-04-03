package za.ac.rick.Builder;

/**
 * Created by Rick on 03-Apr-16.
 */
public interface PizzaBuilder {
    public void buildPizzaBase();
    public void buildPizzaSize();
    public void buildPizzaTopping();
    public Pizza getPizza();

}
