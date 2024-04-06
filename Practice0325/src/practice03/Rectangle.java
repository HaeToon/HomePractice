package practice03;

public class Rectangle {
    int x,y,width,height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    boolean contains(Rectangle rect){
        if(x<rect.x &&
           y<rect.y &&
           x+width>rect.x+rect.width &&
           y+height>rect.y+rect.height
        ){
            return true;
        } else {
            return false;
        }
    }
    int square(){
        return width*height;
    };
    void show(){
        System.out.println("("+x+","+y+")"+"에서 넓이가"+square()+"인 사각형");
    }
}
