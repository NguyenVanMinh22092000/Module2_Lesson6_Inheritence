package Practice3;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point3D D3 = new Point3D(6, 6, 3);
        Point2D d2 = new Point2D(3, 6);
        System.out.println(d2.getX());
        System.out.println(d2.getY());
        System.out.println(Arrays.toString(d2.getXY()));
        System.out.println(D3.toString());
        System.out.println(Arrays.toString(D3.getXYZ()));
    }
}
