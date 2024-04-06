package practice04;

public class Point3D extends Point {
    private int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    //읽기전용
    public void moveUp() {
        z++;
    }
    public void moveDown() {
        z--;
    }

    @Override
    public String toString() {
        return  "("+getX()+","+getY()+","+z+")의 점";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(10,10,10);
        point3D.moveUp();
//        point3D.moveUp();
//        point3D.moveUp();
//        point3D.moveUp();
        System.out.println(point3D.toString());
        //10,10,14
    }
}
