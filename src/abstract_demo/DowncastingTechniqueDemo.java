package abstract_demo;

abstract class ShapeDown {
}

class RectangleDown extends ShapeDown {
    public void showRectangle() {
        System.out.println("Rectangle method called");
    }
}

public class DowncastingTechniqueDemo {

    public static void main(String[] args) {
        ShapeDown s = new RectangleDown();

        // Inline Downcasting
        ((RectangleDown) s).showRectangle();

        // Downcasting to a subclass reference
        RectangleDown r = (RectangleDown) s;
        r.showRectangle();
    }
}
