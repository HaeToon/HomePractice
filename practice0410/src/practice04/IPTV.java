package practice04;

public class IPTV extends ColorTV{
private String ip;
    IPTV(String ip ,int size,int color){
        super(size,color);
        this.ip=ip;
    }
    void printProperty(){
        System.out.println("나의 IPTV는 " + ip + "주소의 ");
        super.printProperty();
    }
}
