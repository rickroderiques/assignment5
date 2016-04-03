package za.ac.rick.Proxy;

import java.util.Date;
/**
 * Created by Rick on 03-Apr-16.
 */
public class Animal {
    public void speed() {
        System.out.println(this.getClass().getSimpleName() + " runs at " + new Date());
    }
}
