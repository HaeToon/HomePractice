package practice04;

public class IPTV extends ColorTV {
    private String ip;
    public IPTV(String ip,int size, int color) {
        super(size, color);
        this.ip = ip;
    }
    public void printProperty() {
        System.out.println("나의 IPTV는 "+ip+"주소의 ");
        super.printProperty();
    }

    public static void main(String[] args) {
        IPTV iptv = new IPTV("127.0.0.1",64,1920*2*2);
        iptv.printProperty();
    }
}