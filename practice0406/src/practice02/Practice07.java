package practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice07 {
    /*정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여
   배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum=0;
        for(int i=0; i<10; i++){
            arr[i]=(int)(Math.random()*10+1);
            sum+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("평균은"+sum/arr.length);
    }
}
