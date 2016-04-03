package za.ac.rick.Abstract;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.views.AbstractView;
import za.ac.rick.Abstract.Factories.AbstractFactory;
import za.ac.rick.Abstract.Factories.TypeFactory;

import static org.junit.Assert.*;

/**
 * Created by Rick on 01-Apr-16.
 */
public class ToyotaTest {
    AbstractFactory abstractFactory = new AbstractFactory();
    Car car;

    @Before
    public void setUp(){

        //checks which factory to call
        TypeFactory typeFactory = abstractFactory.getTypeFactory("leisure");
        car = typeFactory.getCar("toyota");
        //car holds now the string value of Toyota.
    }

    @Test
    public void testBrand() throws Exception {
            assertEquals("this is a toyota, normal Car", car.brand());
    }
}