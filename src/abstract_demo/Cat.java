package abstract_demo;

// Cat class implements Animal interface
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("The cat is eating fish...");
    }

    @Override
    public void sound() {
        System.out.println("Meow! Meow!");
    }
}
