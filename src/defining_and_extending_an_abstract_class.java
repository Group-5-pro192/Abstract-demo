// 1. Define an Abstract Class with concrete and abstract methods
 abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Concrete Method (has a body)
    public void display() {
        System.out.println("Shape Color: " + color);
    }

    // Abstract Methods (no body, ends with ;)
    public abstract double circumstance();
    public abstract double area();
}

// 2. Concrete Subclass MUST override (@Override) ALL abstract methods
class Circle extends Shape {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double circumstance() { return 2 * Math.PI * r; }

    @Override
    public double area() { return Math.PI * r * r; }
}

 class Program {
    public static void main(String[] args) {
        // Shape s = new Shape("Red"); // COMPILE ERROR: Cannot instantiate directly!
        Shape s = new Circle("Blue", 5.0); // Valid: Parent reference, Child object
        s.display();
        System.out.println("Area: " + s.area());
    }
}