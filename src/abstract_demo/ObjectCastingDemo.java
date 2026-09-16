package abstract_demo;

abstract class ShapeBase {
    public abstract void draw();
}

class Rectangle extends ShapeBase {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ObjectCastingDemo {

    public static void main(String[] args) {
        ShapeBase obj = new Rectangle();

        System.out.println("Static type: ShapeBase");
        System.out.println("Dynamic type: Rectangle");

        obj.draw();
    }
}
