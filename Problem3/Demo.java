package Problem3;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println(p1);

        MovablePoint mp1 = new MovablePoint(2.5f, 3.5f, 1.0f, 1.5f);
        System.out.println(mp1);
        mp1.move();
        System.out.println(mp1);
    }
}
