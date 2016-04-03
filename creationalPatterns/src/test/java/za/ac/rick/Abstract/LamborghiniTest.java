package za.ac.rick.Abstract;

import org.junit.Before;
import org.junit.Test;
import za.ac.rick.Abstract.Factories.AbstractFactory;
import za.ac.rick.Abstract.Factories.TypeFactory;

import static org.junit.Assert.*;

/**
 * Created by Rick on 01-Apr-16.
 */
public class LamborghiniTest {

    AbstractFactory abstractFactory = new AbstractFactory();
    Car car;

    @Before
    public void setUp(){

        //checks which factory to call
        TypeFactory typeFactory = abstractFactory.getTypeFactory("sports");
        car = typeFactory.getCar("lambo");
        //car holds now the string value of Lamborghini.
    }

    @Test
    public void testBrand() throws Exception {
        assertEquals("this is a lambo, sports car", car.brand());
    }
}