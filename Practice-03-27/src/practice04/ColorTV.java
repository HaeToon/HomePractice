package practice04;

public class ColorTV extends TV {
    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() {
        System.out.println(this.getSize() + "인치, 해상도는 " + this.color);
    }

    public static void main(String[] args) {
        ColorTV colorTV = new ColorTV(64, 1024);
        colorTV.printProperty();
    }
}