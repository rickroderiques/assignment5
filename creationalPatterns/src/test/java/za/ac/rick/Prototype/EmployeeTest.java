package za.ac.rick.Prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 03-Apr-16.
 */
public class EmployeeTest {

    Employee emp1;
    Employee emp2;
    @Before
    public void setUp()
    {
        emp1 = new Employee("Rick");
        emp2 = (Employee) emp1.doClone();
    }

    @Test
    public void testDoClone() throws Exception {
        assertEquals(emp1.toString(), emp2.toString());
    }
}