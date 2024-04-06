package practice01;

import java.util.Scanner;

public class Practice01 {
    /*Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
   다음 예시와 같이 출력하는 프로그램을 작성하라.
   ($1=1300원으로 가정) 원화를 입력하세요(단위 원) >> 3300*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("달러로 바꿀 돈을 입력해주세요.");
        int won = sc.nextInt();
        int dollor = won/1300;
        System.out.println(won+"원은 " + dollor+"$입니다.");
    }
}
