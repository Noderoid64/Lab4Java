package models;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return ((Point) obj).x == x && ((Point) obj).y == y;
        } else {
            return super.equals(obj);
        }
    }
}
