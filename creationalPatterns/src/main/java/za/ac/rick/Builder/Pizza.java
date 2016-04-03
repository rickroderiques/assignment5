package za.ac.rick.Builder;

/**
 * Created by Rick on 03-Apr-16.
 */
public class Pizza {

    private String pizzaBase;
    private String pizzaSize;
    private String pizzaTopping;

    public void setPizzaBase(String pizzaBase)
    {
        this.pizzaBase = pizzaBase;
    }
    public void setPizzaSize(String pizzaSize)
    {
        this.pizzaSize = pizzaSize;
    }
    public void setPizzaTopping(String pizzaTopping)
    {
        this.pizzaTopping = pizzaTopping;
    }

    /**getters */
    public String getPizzaBase()
    {
        return pizzaBase;
    }
    public String getPizzaSize()
    {
        return pizzaSize;
    }
    public String getPizzaTopping()
    {
        return pizzaTopping;
    }

    public String toString()
    {
        return "pizzaBase: " + pizzaBase + "\nstaff number: " + pizzaSize + "\npizzaTopping: " + pizzaTopping;
    }
}
