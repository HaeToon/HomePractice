import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2자리 정수를 입력해주세요");

        int num = scanner.nextInt();
        if(num/10==num%10) {
            System.out.println("Yes! 10의자리와 1의자리가 같습니다."+num);
        }
    }
}
