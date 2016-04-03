package za.ac.rick.Factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 31-Mar-16.
 */
public class BMWTest {

    CarFactory carFactory;
    Car car;

    @Before
    public void setUp()
    {
        carFactory = CarFactory.getCarFactoryInstance();
        car = carFactory.getCarType("Luxury"); //2. assigning to a object instance of type Car (interface)
    }

    @Test
    public void testType() throws Exception {
        //1. using the car (interface) to call the type() method
        assertEquals("high end/luxury car",car.type());
    }
}