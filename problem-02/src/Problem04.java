import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        /*Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을
   작성하라. 다음은 e를 입력받았을 경우이다.
     abcde
      abcd
       abc
        ab
         a   */
        Scanner scanner = new Scanner(System.in);
        System.out.println("소문자 알파벳 하나를 입력해 주세요.");
        String ch = scanner.next();
        char chCopy = ch.charAt(0);
        System.out.println(chCopy);
        for (char i = chCopy; i >= 'a'; i--) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
