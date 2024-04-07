package practice04;

public class ColorTV extends TV{
    private int pixel;

    public ColorTV(int size ,int pixel) {
        super(size);
        this.pixel=pixel;
    }

    public int getPixel() {
        return pixel;
    }

    void printProperty (){
        System.out.println(getSize() +"인치"+ pixel+"해상도");
    }

}
