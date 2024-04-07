package practice04;

public class ColorPoint extends Point{
    private String color;

    public ColorPoint() {
        super();
        color="black";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return  getColor()+"색의"+"("+getX()+","+getY()+")의 점";
    }
    public String getColor() {
        return color;
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color=color;
    }
    void setXY(int x , int y){
        move(x,y);
    }
    void setColor(String color){
        this.color=color;
    }
}
