package practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("정수몇개?");
        int num = sc.nextInt();
        arr= new int[num];
        for(int i=0; i<num; i++){
            arr[i]=(int)(Math.random()*100)+1;
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
