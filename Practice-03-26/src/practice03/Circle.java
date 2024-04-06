package practice03;

public class Circle {
    private double x,y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    double Area(){
        return radius*radius*3.14;
    }
}
