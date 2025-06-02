// This class represents a line segment using two MyPoint instances.

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructors
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters
    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    // Setters
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Get X and Y of begin
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Get X and Y of end
    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // Get length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // toString method
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
