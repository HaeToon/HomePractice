package practice01;

import java.util.Scanner;

public class Practice05 {
    /* Scanner 를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고
   이 3개의 수로 삼각형을 만들 수 있는 지 판별하라.
   삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
   정수 3개 입력 >> 4 3 5*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        System.out.println("삼각형의 변이될 정수 3가지를 입력해주세요");
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        if (arr[0] + arr[1] <= arr[2] ||
            arr[0] + arr[2] <= arr[1] ||
            arr[1] + arr[2] <= arr[0]) {
            System.out.println("삼각형이 될수 없습니다.");
        } else {
            System.out.println("삼각형이 될수 있습니다.");
        }
    }
}
