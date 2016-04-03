package za.ac.rick.Component;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 03-Apr-16.
 */
public class CompositeTest {

    Leaf leaf1 = new Leaf("parrot");
    Leaf leaf2 = new Leaf("eagle");
    Leaf leaf3 = new Leaf("whale");
    Leaf leaf4 = new Leaf("shark");
    Leaf leaf5 = new Leaf("Lion");

    Composite composite1;
    Composite composite2;
    Composite composite3;

    @Before
    public void setUp()
    {
        composite1 = new Composite();
        composite2 = new Composite();
        composite3 = new Composite();

    }

    @Test
    public void testSayFly() throws Exception {
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite1.sayFly();

    }

    @Test
    public void testSaySwim() throws Exception {
        composite2.add(leaf3);
        composite2.add(leaf4);

        composite2.saySwim();

        //assertEquals();
    }

    @Test
    public void testSayAnimal() throws Exception {
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(leaf5);

        composite3.sayAnimal();

        //assertEquals("Lion is a animal", leaf5.sayAnimal());
    }
}