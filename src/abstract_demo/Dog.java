package abstract_demo;

// Dog class implements Animal interface
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("The dog is eating bones...");
    }

    @Override
    public void sound() {
        System.out.println("Woof! Woof!");
    }
}
