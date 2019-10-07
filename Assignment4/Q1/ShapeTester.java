package Q1;

public class ShapeTester {
    public static void main(String args[]){
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);
        Square sq = new Square(4.0);

        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
        System.out.println(r.draw());
        System.out.println(c.draw());
        System.out.println(s.draw());
        System.out.println(sq.draw());
    }
}
