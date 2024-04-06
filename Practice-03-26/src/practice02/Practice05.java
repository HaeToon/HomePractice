package practice02;
import java.util.Scanner;
public class Practice05 {
    /*양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서
   3의 배수만 출력하는 프로그램을 작성하라. */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("양의정수 10개를 입력해 주세요.");
        int numArr[]=new int[10];
        for(int i=0; i<10; i++) {
            int num = scanner.nextInt();
            numArr[i]=num;
        }
        for(int i=0; i<numArr.length;i++) {
            if(numArr[i]%3==0) {
                System.out.println(numArr[i]);
            }
        }
    }
}
