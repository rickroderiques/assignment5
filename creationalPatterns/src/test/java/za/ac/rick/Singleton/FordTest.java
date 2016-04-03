package za.ac.rick.Singleton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Rick on 31-Mar-16.
 */
public class FordTest {
    Ford car;
    int carCurrentPosition = 6;

     @Before
    public void setUp() throws Exception
    {
        car = Ford.getInstance();
    }

    @After //clean up
    public void clearAll() throws Exception{
        car = null;
    }

    @Test
    public void testMoveForward() throws Exception {

        Assert.assertEquals(11, car.getMoveForward(5, carCurrentPosition));
    }

    @Test
    public void testMoveReverse() throws Exception {
        Assert.assertEquals(4, car.getMoveReverse(2, carCurrentPosition));
    }
}