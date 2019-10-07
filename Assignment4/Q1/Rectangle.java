package Q1;

public class Rectangle extends Shape {
    double a,b;
    public Rectangle(double a, double b){
        this.name = "Drawing Rectangle";
        this.a = a;
        this.b = b;
    }
    public String draw(){
        return name;
    }
    public double getArea(){
        return a * b;
    }
    public double getPerimeter(){
        return 2 * (a + b);
    }
}
