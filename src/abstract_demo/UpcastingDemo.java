abstract class Shape {
    
    public abstract void draw();
}

class Rectangle extends Shape {

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

        Rectangle r = new Rectangle();

        Shape s = r;

        s.draw();
    }
}
