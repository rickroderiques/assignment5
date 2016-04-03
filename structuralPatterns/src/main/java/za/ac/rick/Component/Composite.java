package za.ac.rick.Component;

/**
 * Created by Rick on 03-Apr-16.
 */


import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    List<Component> components = new ArrayList<Component>();

    public void saySwim() {
        for (Component component : components) {
            component.saySwim();
        }
    }

    public void sayFly() {
        for (Component component : components) {
            component.sayFly();
        }
    }

    public void sayAnimal() {
        for (Component component : components) {
            component.sayAnimal();
        }
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getComponent(int index) {
        return components.get(index);
    }
}
