package practice01;
import java.util.Scanner;
public class Practice08 {
    /*사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 + - * / 의 네 가지로
   하고 피연산자는 모두 실수로 한다.
   피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
   0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        String operator;
        System.out.println("정수2개와 연산자를 입력해 주세요.");
        a=scanner.nextInt();
        b=scanner.nextInt();
        operator=scanner.next();
        if(operator.equals("+")) {
            System.out.println(a+b);
        }else if(operator.equals("-")) {
            System.out.println(a-b);
        }else if(operator.equals("*")) {
            System.out.println(a*b);
        }else if(operator.equals("/")) {
            if (a==0 || b==0) {
                System.out.println("0을 나누거나 0으로 나눌수 없습니다.");
            }else {
                System.out.println(a/b);
            }
        }
    }
}
