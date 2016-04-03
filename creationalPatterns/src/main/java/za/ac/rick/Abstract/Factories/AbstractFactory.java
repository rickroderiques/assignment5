package za.ac.rick.Abstract.Factories;

/**
 * Created by Rick on 01-Apr-16.
 */
public class AbstractFactory {

   public TypeFactory getTypeFactory(String type){
       if ("sports".equals(type)) {
           return new SportsFactory();
       } else {
           return new LeisureFactory();
       }

   }

}
