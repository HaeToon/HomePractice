import java.util.Scanner;

public class Problem0302 {
    public static void main(String[] args) {
        //03의 피라미드버전

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해 주세요");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            for(int j= 0; j<num-i; j++ ) {
                System.out.print(" ");
            }
            for (int k = num - i; k <= num+i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
