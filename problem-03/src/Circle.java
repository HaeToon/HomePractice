public class Circle {
    private double x,y;
    private int radius;

    Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    double circleArea(){
        return radius*radius*3.14;
    }

}
