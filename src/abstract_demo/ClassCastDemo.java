
abstract class Shape {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}

public class ClassCastDemo {

    public static void main(String[] args) {

        Shape s = new Circle();

        System.out.println("Object is Circle");

        Rectangle r = (Rectangle) s;

        System.out.println("Casting successful");
    }
}
