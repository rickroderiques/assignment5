package za.ac.rick.Proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 03-Apr-16.
 */
public class ProxyTest {

    @Test
    public void testSpeed() throws Exception {

        Proxy proxy = new Proxy();
        FastRabbit fastThing = new FastRabbit();
        fastThing.speed();

        proxy.speed();

        assertNotSame(fastThing.hashCode(), proxy.hashCode());
    }
}