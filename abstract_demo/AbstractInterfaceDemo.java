package animal_advanced_demo;

import java.util.ArrayList;
import java.util.List;

// ============================================================================
// 1. INTERFACES (Supplementary capabilities - "CAN-DO")
// ============================================================================
interface Playable {

    int MAX_PLAY_TIME_MINUTES = 60; // Constant (public static final)

    boolean playWithHuman(int minutes); // Abstract method
}

interface Trainable {

    void performTrick(String trickName);

    // Default method (Java 8+) - Keeping your sleep() method!
    default void sleep() {
        System.out.println("   [ACTION] This animal is sleeping soundly...");
    }
}

// ============================================================================
// 2. ABSTRACT CLASS (Core nature - "IS-A")
// ============================================================================
abstract class Animal {

    public static final int NUMBER_OF_LEGS = 4; // Bringing your constant here

    private String animalId; // Encapsulated Field
    private String name;

    // Abstract Class Constructor
    public Animal(String animalId, String name) {
        this.animalId = animalId;
        this.name = name;
    }

    // Getters
    public String getAnimalId() {
        return animalId;
    }

    public String getName() {
        return name;
    }

    // Concrete Method: Shared logic for all animals
    public void logAnimal() {
        System.out.println("-> [PROFILE] ID: " + animalId + " | Name: " + name + " | Standard legs: " + NUMBER_OF_LEGS);
    }

    // Abstract Method: Subclasses are forced to implement (kept yours)
    public abstract void eat();
    public abstract void sound();
}

// ============================================================================
// 3. CONCRETE SUBCLASSES (Actual implementations)
// ============================================================================
// Class 1: Dog (Extends Animal, implements Playable & Trainable)
class Dog extends Animal implements Playable, Trainable {

    public Dog(String animalId, String name) {
        super(animalId, name);
    }

    @Override
    public void eat() {
        System.out.println("[Dog " + getName() + "] Is eating bones...");
    }

    @Override
    public void sound() {
        System.out.println("[Dog " + getName() + "] Sounds: Woof! Woof!");
    }

    @Override
    public boolean playWithHuman(int minutes) {
        if (minutes <= MAX_PLAY_TIME_MINUTES) {
            System.out.println("   [Play] Dog " + getName() + " is happily playing fetch for " + minutes + " minutes.");
            return true;
        }
        System.out.println("   [Warning] The dog is exhausted, cannot play for more than " + MAX_PLAY_TIME_MINUTES + " minutes!");
        return false;
    }

    @Override
    public void performTrick(String trickName) {
        System.out.println("   [Train] Dog " + getName() + " successfully performed the trick: " + trickName);
    }
}

// Class 2: Cat (Extends Animal, implements Playable only)
class Cat extends Animal implements Playable {

    public Cat(String animalId, String name) {
        super(animalId, name);
    }

    @Override
    public void eat() {
        System.out.println("[Cat " + getName() + "] Is eating fish...");
    }

    @Override
    public void sound() {
        System.out.println("[Cat " + getName() + "] Sounds: Meow! Meow!");
    }

    @Override
    public boolean playWithHuman(int minutes) {
        System.out.println("   [Play] Cat " + getName() + " is playing with a yarn ball...");
        return true;
    }
}

// Class 3: Wild Wolf (Extends Animal only, NOT Playable, NOT Trainable as it is a wild beast)
class Wolf extends Animal {

    public Wolf(String animalId, String name) {
        super(animalId, name);
    }

    @Override
    public void eat() {
        System.out.println("[Wolf " + getName() + "] Is tearing prey in the deep forest...");
    }

    @Override
    public void sound() {
        System.out.println("[Wolf " + getName() + "] Howls: A-wooooooooo!");
    }
}

// ============================================================================
// 4. MAIN CLASS (Main class to run Demo)
// ============================================================================
public class AdvancedAnimalDemo {

    public static void main(String[] args) {
        System.out.println("========== ANIMAL MANAGEMENT SYSTEM ==========\n");

        // 1. UPCASTING & POLYMORPHISM
        // Create a list using the parent class Animal type
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Dog("D-001", "Buddy"));
        animalList.add(new Cat("C-002", "Luna"));
        animalList.add(new Wolf("W-003", "Lone Wolf"));

        // 2. ITERATE LIST & EXECUTE POLYMORPHISM
        int index = 1;
        for (Animal a : animalList) {
            System.out.println("--- Animal #" + (index++) + " ---");
            a.logAnimal();     // Call the shared method of the parent class
            a.eat();           // Polymorphism: Automatically runs the specific eat logic
            a.sound();         // Polymorphism: Automatically runs the specific sound logic

            // 3. CHECK CAPABILITY (INTERFACE) & SAFE DOWNCASTING WITH 'instanceof'
            
            // Check if the animal is trainable
            if (a instanceof Trainable) {
                Trainable trainedPet = (Trainable) a; // Safe Downcasting
                trainedPet.performTrick("Handshake");
                trainedPet.sleep(); // Call default method from the interface
            }

            // Check if the animal is playable with humans
            if (a instanceof Playable) {
                Playable pet = (Playable) a; // Safe Downcasting
                pet.playWithHuman(45);
            } else {
                System.out.println("   [Danger] This is a wild beast, cannot play with humans!");
            }
            
            System.out.println();
        }

        System.out.println("================ EXECUTION COMPLETED ================");
    }
}