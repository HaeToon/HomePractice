import java.util.Scanner;

public class Problem0301 {
    public static void main(String[] args) {
        //3번의 역순을 구현
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해 주세요");
        int num = scanner.nextInt();
//        for(int i=0; i<num; i++ ) {
//            for(int j=num-i;j<=num; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
