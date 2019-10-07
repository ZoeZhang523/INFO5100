package Q1;

public class Square extends Shape {
    double a;
    public Square(double a){
        this.name = "Drawing Square";
        this.a = a;
    }
    public String draw(){
        return name;
    }
    public double getArea(){
        return a * a;
    }
    public double getPerimeter(){
        return 4 * a;
    }

}
