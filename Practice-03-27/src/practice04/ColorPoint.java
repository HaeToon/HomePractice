package practice04;

public class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x,int y, String color) {
        super(x,y);
        this.color = color;
    }
    public String toString() {
        return color+"색의 "+ "("+this.getX()+","+this.getY()+")의 점입니다.";
    }
    public void setXY(int x, int y) {
        move(x,y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
        ColorPoint colorPoint = new ColorPoint(5,5,"red");
        //toString  메서드는 모든 객체의 조상인 object가 가지고 있는 method이다.
        // 즉 모든 객체는 toString을 쓸 수 있다.
        System.out.println(colorPoint.toString());
        colorPoint.setXY(10,10);
        colorPoint.setColor("yellow");
        System.out.println(colorPoint.toString());
    }
}