package za.ac.rick.Abstract.Factories;
import za.ac.rick.Abstract.*;
import java.net.CacheRequest;

/**
 * Created by Rick on 01-Apr-16.
 */
public class SportsFactory extends TypeFactory {

    public Car getCar(String type)
    {
        if ("lambo".equalsIgnoreCase(type)) {
            return new Lamborghini();
        } else {
            return new Ferrari();
        }
    }
}
