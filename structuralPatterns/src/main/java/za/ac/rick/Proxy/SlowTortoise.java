package za.ac.rick.Proxy;

/**
 * Created by Rick on 03-Apr-16.
 */
public class SlowTortoise extends Animal{
    public SlowTortoise() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
