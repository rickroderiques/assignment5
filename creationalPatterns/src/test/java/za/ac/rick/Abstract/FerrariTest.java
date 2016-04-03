package za.ac.rick.Abstract;

import org.junit.Before;
import org.junit.Test;
import za.ac.rick.Abstract.Factories.AbstractFactory;
import za.ac.rick.Abstract.Factories.TypeFactory;

import static org.junit.Assert.*;

/**
 * Created by Rick on 01-Apr-16.
 */
public class FerrariTest {
    AbstractFactory abstractFactory = new AbstractFactory();
    Car car;

    @Before
    public void setUp(){

        //checks which factory to call
        TypeFactory typeFactory = abstractFactory.getTypeFactory("sports");
        car = typeFactory.getCar("ferrari");
        //car holds now the string value of Ferrari.
    }

    @Test
    public void testBrand() throws Exception {
        assertEquals("this is a ferrari, sports car", car.brand());
    }
}