package practice02;
import java.util.Scanner;
public class practice04 {
    /*Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을
   작성하라. 다음은 e를 입력받았을 경우이다.
   abcde
   abcd
   abc
   ab
   a   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch = str.charAt(0);
        for(char i=ch; i>='a'; i--) {
            for(char j='a'; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
