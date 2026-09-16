abstract class Shape {
}

class Rectangle extends Shape {

    public void showRectangle() {
        System.out.println("Rectangle method called");
    }
}

public class DowncastingTechniqueDemo {

    public static void main(String[] args) {

        Shape s = new Rectangle();

        // Inline Downcasting
        ((Rectangle) s).showRectangle();

        // Downcasting to a subclass reference
        Rectangle r = (Rectangle) s;
        r.showRectangle();
    }
}


