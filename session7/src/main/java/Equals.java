
import java.util.Objects;

/**
 * @author Created by ergouser on 16.10.18.
 */
public class Equals {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        p2 = p1;

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        p2 = new Point(1, 3);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        p2.y = 2;

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }

    static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return Double.compare(point.x, x) == 0 &&
                    Double.compare(point.y, y) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
