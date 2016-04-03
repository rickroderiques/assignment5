package za.ac.rick.Factory;

/**
 * Created by Rick on 31-Mar-16.
 */
public class CarFactory {

    private static CarFactory carFactory = null;

    private CarFactory(){
    }

    public static CarFactory getCarFactoryInstance(){
        if(carFactory == null){
            carFactory = new CarFactory(); //creating the object
        }
        return carFactory;
    }

    public Car getCarType(String car) //of type Car interface
    {
        if("Luxury".equalsIgnoreCase(car)){
            return new BMW(); //3. goes to BMW class and returns String
        }
        else return new Hilux();
    }
}
