package pkgabstract;

// Define the abstract class using the 'abstract' keyword
abstract class Animal {

    // 1. Constant variable (static final)
    static final int NUMBER_OF_LEGS = 4;

    // 2. Abstract methods
    abstract void eat();

    abstract void sound();

    // 3. Concrete method (optional)
    public void sleep() {
        System.out.println("This animal is sleeping...");
    }
}

// Dog class extends Animal abstract class
class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("The dog is eating bones...");
    }

    @Override
    public void sound() {
        System.out.println("Woof! Woof!");
    }
}

// Cat class extends Animal abstract class
class Cat extends Animal {

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
public class AbstractAnimal {

    public static void main(String[] args) {
        // Using polymorphism with the abstract class
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("--- Dog Information ---");
        System.out.println("Standard legs: " + Animal.NUMBER_OF_LEGS);
        myDog.eat();
        myDog.sound();
        myDog.sleep(); // Calling concrete method

        System.out.println("\n--- Cat Information ---");
        System.out.println("Standard legs: " + Animal.NUMBER_OF_LEGS);
        myCat.eat();
        myCat.sound();
        myCat.sleep(); // Calling concrete method
    }
}
