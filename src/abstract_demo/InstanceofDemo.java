package abstract_demo;

abstract class ShapeInstance {
}

class RectangleInstance extends ShapeInstance {
    public void showRectangle() {
        System.out.println("This is a Rectangle");
    }
}

class CircleInstance extends ShapeInstance {
}

public class InstanceofDemo {

    public static void main(String[] args) {
        ShapeInstance s = new RectangleInstance();

        if (s instanceof RectangleInstance) {
            RectangleInstance r = (RectangleInstance) s;
            r.showRectangle();
        } else {
            System.out.println("Object is not a Rectangle");
        }
    }
}
