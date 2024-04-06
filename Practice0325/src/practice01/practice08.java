package practice01;
import java.util.Scanner;
public class practice08 {
    /*사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 + - * / 의 네 가지로
   하고 피연산자는 모두 실수로 한다.
   피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
   0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result=0;
        System.out.println("연산할 숫자와 연산자를 입력해주세요");
        System.out.println("첫번쨰 숫자를 입력해 주세요");
        int firstnum=scanner.nextInt();
        System.out.println("두번째 숫자를 입력해 주세요");
        int secondnum=scanner.nextInt();
        System.out.println("연산자를 입력해 주세요.");
        String operator=scanner.next();
        if (operator.equals("+")) {
            result=firstnum+secondnum;
        } else if (operator.equals("-")) {
            result=firstnum-secondnum;

        } else if (operator.equals("*")) {
            result=firstnum*secondnum;
        } else if (operator.equals("/")) {
            result=firstnum/secondnum;
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
        System.out.println(result);


    }
}
