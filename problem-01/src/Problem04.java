import java.util.Arrays;
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        /*Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
          평균값을 구하는 것이 아님에 주의*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력해주세요");
        int arr[] = new int[3];
        int center = 0;
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
        if ((arr[0] >= arr[1]) && (arr[0] <= arr[2]) || (arr[0] >= arr[2]) && (arr[0] <= arr[1])) {
            center = arr[0];
        } else if ((arr[1] >= arr[0]) && (arr[1] <= arr[2]) || (arr[1] >= arr[2]) && (arr[1] <= arr[0])) {
            center = arr[1];
        } else {
            center = arr[2];
        }
        System.out.println("3가지 수중 중간 크기의 수는" + center + "입니다.");
    }
}
