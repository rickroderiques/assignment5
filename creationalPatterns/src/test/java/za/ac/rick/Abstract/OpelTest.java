package za.ac.rick.Abstract;

import org.junit.Before;
import org.junit.Test;
import za.ac.rick.Abstract.Factories.AbstractFactory;
import za.ac.rick.Abstract.Factories.TypeFactory;

import static org.junit.Assert.*;

/**
 * Created by Rick on 01-Apr-16.
 */
public class OpelTest {
    AbstractFactory abstractFactory = new AbstractFactory();
    Car car;

    @Before
    public void setUp(){

        //checks which factory to call
        TypeFactory typeFactory = abstractFactory.getTypeFactory("leisure");
        car = typeFactory.getCar("opel");
        //car holds now the string value of Opel.
    }

    @Test
    public void testBrand() throws Exception {
        assertEquals("this is a Opel, normal Car", car.brand());
    }
}