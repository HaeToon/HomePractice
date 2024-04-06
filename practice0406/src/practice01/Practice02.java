package practice01;

import java.util.Scanner;

public class Practice02 {
    /* Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
	 십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
	 2자리수 정수 입력(10~99) >> 77*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10~99사이의 정수를 입력해주세요.");
        int num = sc.nextInt();
        int fir=num/10;
        int sec=num%10;

        if(num>9 && num<100){
            if(fir!=0 && fir==sec){
                System.out.println("10의자리 ="+fir+", 1의자리 =" +sec + "가 같습니다.");
            }else {
                System.out.println("10의자리와 1의자리가 다릅니다." + num);
            }
        }else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}
