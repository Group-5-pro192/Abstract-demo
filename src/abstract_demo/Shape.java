package abstract_demo;

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
