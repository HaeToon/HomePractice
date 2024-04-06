package practice01;
import java.util.Scanner;
public class practice01 {
    public static void main(String[] args) {
        /* Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
   다음 예시와 같이 출력하는 프로그램을 작성하라.
   ($1=1300원으로 가정) 원화를 입력하세요(단위 원) >> 3300*/
        Scanner scanner= new Scanner(System.in);

        System.out.println("달러로 바꿀 원화를 입력해 주세요.");
        int won = scanner.nextInt();
        double wonToDollar =won/1300.0;
        System.out.println(won+"원은" + wonToDollar+"$입니다.");
    }
}
