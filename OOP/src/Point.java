public class Point {

    public Point() {};
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return this.distance(new Point());
    }

    public double distance(int x, int y) {
        return this.distance(new Point(x, y));
    }

    public double distance(Point rhs) {
        int x_dist = this.x - rhs.x;
        int y_dist = this.y - rhs.y;
        return Math.sqrt(x_dist * x_dist + y_dist * y_dist);
    }

    private int x, y;
}
