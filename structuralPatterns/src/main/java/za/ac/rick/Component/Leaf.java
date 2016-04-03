package za.ac.rick.Component;

/**
 * Created by Rick on 03-Apr-16.
 */
public class Leaf implements Component {

    String animal;

    public Leaf(String animal) {
        this.animal = animal;
    }

    public void saySwim() {
        System.out.println(animal + " can swim");
    }

    public void sayFly() {
        System.out.println(animal + " can fly");
    }

    public void sayAnimal() {
        System.out.println(animal + " is a animal");
    }
}
