package abstract_demo;

// Main class to run the Animal demonstration
public class AnimalDemo {

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
