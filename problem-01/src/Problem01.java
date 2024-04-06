import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        /*Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
        다음 예시와 같이 출력하는 프로그램을 작성하라.
        ($1=1300원으로 가정) 원화를 입력하세요(단위 원)*/
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double dollar = (double)num/1300;
        String dollarWon = String.format("%.2f",dollar);
        System.out.println(num+"원은 "+dollarWon+"$ 입니다.");
    }
}
