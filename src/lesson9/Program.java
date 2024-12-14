package lesson9;

import static java.lang.System.*;

public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(3, 4);
//        System.out.println(p3.count);
//        System.out.println(Point.getCount());
        out.println(Point.getCount());
    }
}

class Point{
    private static int count;  // 3
    int x;
    int y;

    static {
        count = 10;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.count++;
    }

    public static int getCount() {
        return count;
    }
}
