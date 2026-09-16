abstract class Shape {
}

class Rectangle extends Shape {

    public void showRectangle() {
        System.out.println("This is a Rectangle");
    }
}

class Circle extends Shape {
}

public class InstanceofDemo {

    public static void main(String[] args) {

        Shape s = new Rectangle();

        if (s instanceof Rectangle) {

            Rectangle r = (Rectangle) s;

            r.showRectangle();

        } else {

            System.out.println("Object is not a Rectangle");
        }
    }
}

