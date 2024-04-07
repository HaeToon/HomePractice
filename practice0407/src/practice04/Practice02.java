package practice04;

public class Practice02 {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
