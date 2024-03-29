package lectures.lecture1;

public class Point2D {
    private int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x +
                ", y = " + y;
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

    /**
     * @param a - экземпляр класса
     * @param b - экземпляр класса
     * @return дистанция между двумя точками
     */
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }
}
