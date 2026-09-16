abstract class Shape {

    public abstract void draw();
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ObjectCastingDemo {

    public static void main(String[] args) {

        Shape obj = new Rectangle();

        System.out.println("Static type: Shape");
        System.out.println("Dynamic type: Rectangle");

        obj.draw();
    }
}
