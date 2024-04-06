import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
       /* Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권,
          500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전,
          1원짜리 동전 각 몇개로 변환되는지 출력하라.*/
        Scanner scanner = new Scanner(System.in);
        int n[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        System.out.println("돈을 입력해주세요.");
        int num = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            int rest = num / n[i];
            System.out.println(n[i] + "원" + rest + "개");
            num = num % n[i];
        }
    }
}
