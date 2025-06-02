// This class represents a rectangle defined by two corner points.

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setters
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Width = difference in X coordinates
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Height = difference in Y coordinates
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight +
               ", width=" + getWidth() + ", height=" + getHeight() +
               ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
