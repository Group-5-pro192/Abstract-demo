package pkginterface;

// Define the interface using the 'interface' keyword
interface Animal {

    // 1. Constant variable (implicitly public static final)
    int NUMBER_OF_LEGS = 4;

    // 2. Abstract methods (implicitly public abstract)
    void eat();

    void sound();

    // 3. Default method (optional - JDK 8+)
    default void sleep() {
        System.out.println("This animal is sleeping...");
    }
}

// Dog class implements Animal interface
class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("The dog is eating bones...");
    }

    @Override
    public void sound() {
        System.out.println("Woof! Woof!");
    }
}

// Cat class implements Animal interface
class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("The cat is eating fish...");
    }

    @Override
    public void sound() {
        System.out.println("Meow! Meow!");
    }
}

// Main class to run the program
public class Interface {

    public static void main(String[] args) {
        // Using polymorphism with the interface
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("--- Dog Information ---");
        System.out.println("Standard legs: " + Animal.NUMBER_OF_LEGS);
        myDog.eat();
        myDog.sound();
        myDog.sleep(); // Calling default method

        System.out.println("\n--- Cat Information ---");
        System.out.println("Standard legs: " + Animal.NUMBER_OF_LEGS);
        myCat.eat();
        myCat.sound();
        myCat.sleep(); // Calling default method
    }
}
