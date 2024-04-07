package practice04;

public class Point3D extends Point{
    private int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")의 점";
    }

    void moveUp(){
        setZ(z++);
    }
    void moveDown(){
        setZ(z--);
    }
    void move(int x,int y, int z){
        super.getX();
        super.getY();
        this.z=z;
    }
}
