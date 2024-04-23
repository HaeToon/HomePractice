package practice01;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("삼각형의 변이 될 세 정수를 입력해 주세요.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b<=c ||
        b+c <=a ||
        c+a <=b){
            System.out.println("삼각형이 될수 없습니다.");
        }else {
            System.out.println("삼각형이 될수 있습니다.");
        }
    }

}
