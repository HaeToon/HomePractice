package practice01;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수3개를 입력해 주세요");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int center =0;
        if(a>b && a<c ||
        a<b && a>c){
            center=a;
        }else if(b>c && b<a ||
                b<c && b>a){
            center=b;
        }else{
            center=c;
        }
        System.out.println("중간값 = "+center);
    }
}
