package practice01;

import java.util.Scanner;

public class Practice03 {
    /*Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권,
   500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전,
   1원짜리 동전 각 몇개로 변환되는지 출력하라.*/
    public static void main(String[] args) {
        int arr[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("변환할 돈을 입력해주세요");
        int won = sc.nextInt();
        int change=0;

        for(int i=0; i<arr.length;i++){
            change=won/arr[i];
            System.out.println(arr[i]+"원"+change+"개");
            won=won%arr[i];
        }
    }
}
