package practice05;

public class Circle {
    private int x , y , radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle ("+x+","+y+")"+radius;
    }

    @Override
    public boolean equals(Object obj) {
        Circle c = (Circle)obj;
        if(x==c.x && y== c.y) {
            return true;
        }else{
            return false;
        }
    }
}
