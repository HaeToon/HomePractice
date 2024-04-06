package practice01;
import java.util.Scanner;
public class practice04 {
    /* Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
   평균값을 구하는 것이 아님에 주의*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int center = 0;
        int numArr[] = new int[3];
        System.out.println("정수 3개를 입력해 주세요.");
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            numArr[i] = num;
        }
        if (numArr[0] > numArr[1] && numArr[0] < numArr[2]) {
            System.out.println("중간값은 " + numArr[1] + "입니다.");
        } else if(numArr[1]>numArr[0] && numArr[1]<numArr[2]) {
            System.out.println("중간값은 " +numArr[1]+"입니다.");
        }else{
            System.out.println("중간값은 "+ numArr[2]+"입니다.");
        }
    }
}
