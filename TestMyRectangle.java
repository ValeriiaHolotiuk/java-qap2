// Tests the MyRectangle and MyPoint classes using unique coordinate values

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create coordinate points
        MyPoint topLeft = new MyPoint(-5, 20);
        MyPoint bottomRight = new MyPoint(10, 2);

        // Create rectangle
        MyRectangle rect = new MyRectangle(topLeft, bottomRight);
        System.out.println("Initial Rectangle: " + rect);

        // Test dimensions
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        // Update with corners
        rect.setTopLeft(new MyPoint(-10, 18));
        rect.setBottomRight(new MyPoint(5, -1));
        System.out.println("Updated Rectangle: " + rect);
    }
}

