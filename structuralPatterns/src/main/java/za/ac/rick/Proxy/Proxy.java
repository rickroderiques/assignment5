package za.ac.rick.Proxy;

/**
 * Created by Rick on 03-Apr-16.
 */
import java.util.Date;
public class Proxy {

    SlowTortoise slowThing;

    public Proxy() {
        System.out.println("Creating proxy at " + new Date());
    }

    public void speed() {
        if (slowThing == null) {
            slowThing = new SlowTortoise();
        }
        slowThing.speed();
    }
}
