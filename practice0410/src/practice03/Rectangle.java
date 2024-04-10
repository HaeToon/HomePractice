package practice03;

public class Rectangle {
    private int x,y,width,height;

    Rectangle(int x,int y,int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    void show(){
        System.out.println("("+x+","+y+") 에서 크기가"+x+"x"+y+"인 사각형");
    }
    int square(){
        return width*height;
    }
    boolean contains(Rectangle rect){
        if(x<rect.x && y<rect.y && x+width>rect.x+rect.width && y+height > rect.y + rect.height){
            return true;
        }else {
        return false;
        }
    }
}
