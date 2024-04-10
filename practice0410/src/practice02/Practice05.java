package practice02;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[10];
        System.out.println("10개의 정수를 입력해주세요");

        for(int i=0; i<10; i++){
            int num =sc.nextInt();
            arr[i]=num;
        }
        for(int i=0; i<10; i++){
            if(arr[i]%3==0){
                System.out.println(arr[i]);
            }
        }
    }
}
