package practice04;

public class ColorPoint extends Point{
private String color;
    public ColorPoint(int x, int y,String color) {
        super(x, y);
        this.color=color;
    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    public ColorPoint() {
        super();
        setColor("black");
    }

    void setXY(int x, int y){
        move(x,y);
    }
    void setColor(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getColor()+"색의"+"("+getX()+","+getY()+")의 점";
    }
}
