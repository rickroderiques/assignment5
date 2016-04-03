package za.ac.rick.Prototype;

/**
 * Created by Rick on 03-Apr-16.
 */
public class Fish implements Prototype{
    String move;

    public Fish(String move)
    {
        this.move = move;
    }

    public Prototype doClone()
    {
        return new Fish(move);
    }

    public  String toString()
    {
        return "Fish is " + move;
    }
}
