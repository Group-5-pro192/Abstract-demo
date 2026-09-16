package abstract_demo;

abstract class ShapeUp {
    public abstract void draw();
}

class RectangleUp extends ShapeUp {

    @Override
    public void draw() {
        System.out.println("Rectangle is drawing");
    }

    public void showRectangle() {
        System.out.println("This is Rectangle method");
    }
}

public class UpcastingDemo {

    public static void main(String[] args) {
        RectangleUp r = new RectangleUp();
        ShapeUp s = r;
        s.draw();
    }
}
