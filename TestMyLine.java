// This file tests the MyLine and MyPoint classes

public class TestMyLine {
    public static void main(String[] args) {
        // Create two points with coordinates
        MyPoint p1 = new MyPoint(7, 3);
        MyPoint p2 = new MyPoint(12, 9);

        // Create a line using points
        MyLine line1 = new MyLine(p1, p2);
        System.out.println("Line1: " + line1);

        // Test getters
        System.out.println("Begin Point: " + line1.getBegin());
        System.out.println("End Point: " + line1.getEnd());
        System.out.println("Line Length: " + line1.getLength());

        // Test setters withvalues
        line1.setBeginXY(-4, 8);
        line1.setEndXY(10, -2);
        System.out.println("Updated Line1: " + line1);
        System.out.println("Updated Line Length: " + line1.getLength());

        // Another line with direct coordinates
        MyLine line2 = new MyLine(13, 7, 3, 17);
        System.out.println("Line2: " + line2);
        System.out.println("Line2 Begin X: " + line2.getBeginX());
        System.out.println("Line2 End Y: " + line2.getEndY());
    }
}

