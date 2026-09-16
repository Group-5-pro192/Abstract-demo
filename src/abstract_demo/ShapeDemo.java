package abstract_demo;

// Main class to run the Shape demonstration
public class ShapeDemo {
    public static void main(String[] args) {
        // Shape s = new Shape("Red"); // COMPILE ERROR: Cannot instantiate directly!
        Shape s = new Circle("Blue", 5.0); // Valid: Parent reference, Child object
        s.display();
        System.out.println("Area: " + s.area());
    }
}
