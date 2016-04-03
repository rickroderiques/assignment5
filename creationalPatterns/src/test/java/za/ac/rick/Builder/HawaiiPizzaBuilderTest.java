package za.ac.rick.Builder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 03-Apr-16.
 */
public class HawaiiPizzaBuilderTest {


    PizzaBuilder pizzaBuilder;
    PizzaDirector pizzaDirector;
    Pizza pizza;

    @Before
    public void setUp()
    {
        pizzaBuilder = new HawaiiPizzaBuilder();
        pizzaDirector =  new PizzaDirector(pizzaBuilder);
        pizzaDirector.constructPizza();
        pizza = pizzaDirector.getPizza();
    }

    @Test
    public void testBuildPizzaBase() throws Exception {
        assertEquals("white dough", pizza.getPizzaBase());
    }

    @Test
    public void testBuildPizzaSize() throws Exception {
        assertEquals("large", pizza.getPizzaSize());
    }

    @Test
    public void testBuildPizzaTopping() throws Exception {
        assertEquals("pineapples", pizza.getPizzaTopping());
    }
}