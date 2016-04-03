package za.ac.rick.Prototype;

/**
 * Created by Rick on 03-Apr-16.
 */
public class Employee implements Prototype{

    String name;

    public Employee(String name)
    {
        this.name = name;
    }

    public Prototype doClone()
    {
        return new Employee(name);
    }

    public  String toString()
    {
        return "Employee name is: " + name;
    }
}
