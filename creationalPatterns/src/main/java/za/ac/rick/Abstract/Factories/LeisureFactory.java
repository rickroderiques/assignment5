package za.ac.rick.Abstract.Factories;
import za.ac.rick.Abstract.*;
/**
 * Created by Rick on 01-Apr-16.
 */
public class LeisureFactory extends TypeFactory {

    public Car getCar(String type)
    {
        if ("opel".equalsIgnoreCase(type)) {
            return new Opel();
        } else {
            return new Toyota();
        }
    }
}
