package practice02;
import java.util.Arrays;
import java.util.Scanner;
public class Practice08 {
    /* 정수를 몇 개 저장할 지 키보드로부터 100보다 작은 갯수를 입력받아 정수 배열을 생성하고,
   이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라.
   배열에는 같은 수가 없도록 하여 배열을 출력하라. */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("정수 몇개?");
        int numArr[];
        int num = scanner.nextInt();
        numArr=new int[num];
        for(int i=0; i<numArr.length;i++) {
            int random = (int)(Math.random()*100+1);
            numArr[i]=random;
            for(int j=0; j<i; j++) {
                if(numArr[i]==numArr[j]){
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(numArr));
    }
}
