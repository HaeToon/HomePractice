import java.util.Arrays;
import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        /*양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서
         3의 배수만 출력하는 프로그램을 작성하라.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("양의정수 10개를 입력해주세요");
        int arr[] = new int[10];
        for(int i=0; i<10; i++) {
            int num = scanner.nextInt();
            arr[i]=num;
            System.out.println("정수를 " +(i+1)+"개 입력했습니다.");
            }
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<10; i++) {
            if (arr[i]%3==0) {
                System.out.println("입력한 수중 3의 배수는 " +arr[i]+"입니다.");
            }
        }

    }
}
