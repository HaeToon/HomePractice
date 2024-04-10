package practice04;

public class PositivePoint extends Point{
    public PositivePoint(int x, int y) {
        if(x>=0 && y>=0) {
            super.move(x,y);
        }
    }

    @Override
    protected void move(int x, int y) {
        if(x>=0 && y>=0) {
            super.move(x,y);
        }
    }

    public PositivePoint() {

    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+")의 점";
    }
}
