package practice01;

import java.util.Scanner;

public class Practice02 {
    /*Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
	 십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
	 2자리수 정수 입력(10~99) >> 77*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2자리 10~99 정수를 입력해 주세요.");
        int num = scanner.nextInt();
        int first = num/10;
        int second = num%10;

        if(first!=0 && first==second) {
            System.out.println("10의자리와 1의자리가 같습니다."+num);
        }else {
            System.out.println("10의자리와 1의자리가 다릅니다.");
        }
    }
}
