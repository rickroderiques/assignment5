package za.ac.rick.Prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PERSIST_STORE;

import static org.junit.Assert.*;

/**
 * Created by Rick on 03-Apr-16.
 */
public class FishTest {
    Fish fish1;
    Fish fish2;
    @Before
    public void setUp()
    {
        fish1 = new Fish("swimming");
        fish2 = (Fish) fish1.doClone();
    }
    @Test
    public void testDoClone() throws Exception {
        assertEquals(fish1.toString(), fish2.toString());
    }
}