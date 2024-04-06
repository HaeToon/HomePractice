package practice01;
import java.util.Scanner;
public class practice03 {
    public static void main(String[] args) {
        /*Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권,
   500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전,
   1원짜리 동전 각 몇개로 변환되는지 출력하라.*/
        Scanner scanner = new Scanner(System.in);
        int change[]={50000,10000,5000,1000,500,100,50,10};
        int rest;
        System.out.println("정수로 된 돈의 액수를 입력해 주세요.");
        int won = scanner.nextInt();
        for(int i=0; i<won; i++) {
            rest = won/change[i];
            System.out.println(change[i]+"원"+rest+"개");
            won=won%change[i];
        }

    }
}
