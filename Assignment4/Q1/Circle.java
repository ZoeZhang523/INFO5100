package Q1;

public class Circle extends Shape {
    double r;
    final double PI = 3.14;
    public Circle(double r){
        this.name = "Drawing Circle";
        this.r = r;
    }
    public String draw(){
        return name;
    }
    public double getArea(){
        return PI * r * r;
    }
    public double getPerimeter(){
        return 2 * PI * r;
    }
}
