package practice01;

import java.util.Scanner;

public class Practice04 {
    /*Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
   평균값을 구하는 것이 아님에 주의*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[3];
        for(int i=0; i<arr.length; i++){
            int num = sc.nextInt();
            arr[i]=num;
        }
        if(arr[0]>arr[1] && arr[0]<arr[2] ||
           arr[0]>arr[2] && arr[0]<arr[1]
        ){
            System.out.println("중간값은 "+ arr[0]);
        }else if(arr[1]>arr[0] && arr[1]<arr[2] ||
                 arr[1]>arr[2] && arr[1]<arr[0]
        ){
            System.out.println("중간값은 "+ arr[1]);
        }else if(arr[2]>arr[0] && arr[2]<arr[1] ||
                arr[2]>arr[1] && arr[2]<arr[0]
        ){
            System.out.println("중간값은 "+ arr[2]);
        }
    }
}
