package practice04;

public class PositivePoint extends Point {
    public PositivePoint(int x, int y) {
        super(x, y);
        if(x<0){
            setX(0);
        }
        if(y<0){
            setY(0);
        }
    }
    public PositivePoint() {

    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+")의 점";
    }
}
