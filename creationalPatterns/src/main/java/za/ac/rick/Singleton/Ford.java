package za.ac.rick.Singleton;


/**
 * Created by Rick on 31-Mar-16.
 */
public class Ford{

    private static Ford ford = null;

    private Ford() {
    }

    public static Ford getInstance()
    {
        if(ford == null){
            ford = new Ford(); //creating the object
        }
        return ford;
    }

    public int getMoveForward(int forward, int current)
    {
        return current + forward;
    }

    public int getMoveReverse(int reverse, int current)
    {
        return current - reverse;
    }

    public int getMoveForwardLeft(int forwardleft, int current)
    {
        return current + forwardleft;
    }

}
