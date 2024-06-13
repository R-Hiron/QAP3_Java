package Problem2;

public class Demo {
    public static void main(String[] args) {
        Shape s = new Shape("Red", true);
        System.out.println(s);

        Circle c = new Circle(5.0);
        System.out.println(c);

        Circle c1 = new Circle(5.0, "blue", true);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Rectangle r = new Rectangle(2.0, 3.0);
        System.out.println(r);

        Rectangle r1 = new Rectangle(2.0, 3.0, "green", false);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Square sq = new Square(4.0);
        System.out.println(sq);

        Square sq1 = new Square(4.0, "yellow", true);
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
    }
}