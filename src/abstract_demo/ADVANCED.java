public class ADVANCED  {
    public static void main(String[] args) {
        // Direct instantiation of an Abstract Class via an Anonymous Class
        Shape customShape = new Shape("Green") {
            @Override
            public double circumstance() { return 10.0; }

            @Override
            public double area() { return 25.0; }
        }; // Mandatory ending semicolon

        customShape.display();
        System.out.println("Custom Area: " + customShape.area());
    }
}
