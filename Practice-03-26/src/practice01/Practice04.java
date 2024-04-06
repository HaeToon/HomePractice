package practice01;
import java.util.Scanner;
public class Practice04 {
    /*Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
   평균값을 구하는 것이 아님에 주의*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numArr[]=new int[3];
        System.out.println("정수 3개를 입력해 주세요.");
        for(int i=0; i<3; i++) {
            System.out.println((i+1)+"번째 수 입력");
            int num= scanner.nextInt();
            numArr[i]=num;
        }
        if((numArr[0]>numArr[1] && numArr[0]<numArr[2]) ||
        (numArr[0]<numArr[1] && numArr[0]>numArr[2])) {
            System.out.println("중간값은 "+numArr[0]);
        }else if ((numArr[1]>numArr[0] && numArr[1]<numArr[2]) ||
        numArr[1]>numArr[2] && numArr[1]<numArr[0]){
            System.out.println("중간값은 "+numArr[1]);
        }else {
            System.out.println("중간값은 "+numArr[2]);
        }
    }
}
