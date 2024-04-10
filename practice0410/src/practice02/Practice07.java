package practice02;

import java.util.Arrays;

public class Practice07 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum =0;
        for(int i=0; i<10; i++){
            arr[i]=(int)(Math.random()*10)+1;
            sum+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("평균은 =="+sum/arr.length);
    }
}
