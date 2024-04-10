package practice03;

import java.util.Arrays;

public class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
        int c [] = new int[a.length+b.length];
        for(int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        for(int i=0; i<b.length; i++){
            c[i+a.length]=b[i];
        }
        return c;
    }
    public static void print(int[] a) {
        /* 배열 a 출력 */
        System.out.println(Arrays.toString(a));
    }
}
