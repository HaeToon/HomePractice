package practice01;
import java.util.Scanner;
public class Practice05 {
    /*Scanner 를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고
   이 3개의 수로 삼각형을 만들 수 있는 지 판별하라.
   삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("삼각형의 변의 길이를 나타내는 정수 3개를 입력해 주세요.");
        int a = scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a+b<=c ||
        b+c<=a ||
        c+a<=b) {
            System.out.println("삼각형이 될수 없습니다.");
        }else {
            System.out.println("삼각형이 될수 있습니다.");
        }
    }
}
