package practice03;

import java.util.Arrays;

public class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
       int arr[] = new int[a.length+b.length];
        for(int i=0; i<a.length; i++){
            int numA = a[i];
            arr[i]=numA;
        };
        for(int i=0; i<b.length; i++){
            int numB = b[i];
            arr[a.length+i]=numB;
        };
        return arr;
    }
    public static void print(int[] a) {
        /* 배열 a 출력 */
        System.out.println(Arrays.toString(a));

    }
}
