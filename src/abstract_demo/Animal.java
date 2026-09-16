package abstract_demo;

// Define the interface using the 'interface' keyword
public interface Animal {

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
