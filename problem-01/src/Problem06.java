import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        /*369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고
	 정수에 3,6,9 중 하나가 있는 경우는 "박수짝"을 출력하고
	 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
	 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을,
	 36인 경우 "박수짝짝"을 출력하면 된다.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~99사이의 정수를 입력해주세요");
        int num = scanner.nextInt();
        int fir = num / 10;
        int sec = num % 10;
        int count = 0;
        System.out.println("first == " + fir / 10);
        System.out.println(("second == " + sec));
        if (fir != 0 && fir % 3 == 0) {
            count++;
        }
        if (sec != 0 && sec % 3 == 0) {
            count++;
        }
        if (count == 1) {
            System.out.println("짝");
        } else if (count == 2) {
            System.out.println("짝짝");
        }
    }
}
