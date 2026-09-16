package abstract_demo;

abstract class ShapeCast {
}

class RectangleCast extends ShapeCast {
}

class CircleCast extends ShapeCast {
}

public class ClassCastDemo {

    public static void main(String[] args) {
        ShapeCast s = new CircleCast();

        System.out.println("Object is Circle");

        try {
            RectangleCast r = (RectangleCast) s;
            System.out.println("Casting successful");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Cannot cast Circle to Rectangle");
        }
    }
}
