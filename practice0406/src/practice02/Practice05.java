package practice02;

import java.util.Scanner;

public class Practice05 {
    /*양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서
   3의 배수만 출력하는 프로그램을 작성하라. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[10];
        System.out.println("정수 10개를 입력해 주세요");
        for(int i=0; i<10; i++){
            System.out.println((i+1)+"번째 정수 입력");
            int num =sc.nextInt();
            arr[i]=num;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]%3==0){
                System.out.println(arr[i]);
            }
        }

    }
}
