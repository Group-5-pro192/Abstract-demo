package abstract_demo;

// 2. Concrete Subclass MUST override (@Override) ALL abstract methods
class Circle extends Shape {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double circumstance() {
        return 2 * Math.PI * r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
