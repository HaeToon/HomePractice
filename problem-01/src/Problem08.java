import java.util.Scanner;
public class Problem08 {
    public static void main(String[] args) {
        /*사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 + - * / 의 네 가지로
        하고 피연산자는 모두 실수로 한다.
        피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
         0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.*/
        Scanner scanner = new Scanner(System.in);

        int fir = scanner.nextInt();
        String operator = scanner.next();
        int sec = scanner.nextInt();
        int result = 0;

        if (operator.equals("+")) {
            result=fir+sec;
        }else if (operator.equals("-")) {
            result=fir-sec;
        }else if (operator.equals("*")) {
            result=fir*sec;
        }else if (operator.equals("/")) {
            result=fir/sec;
        }else {
            System.out.println("잘못 입력 하셧습니다.");
        }
        System.out.printf("연산결과는 %d %s %d = %d " ,fir,operator,sec,result);
        System.out.println("연산결과는 "+ fir + operator + sec +"= " + result);
    }
}
