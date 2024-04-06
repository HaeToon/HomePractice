package practice03;

import java.util.stream.IntStream;

public class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        /* 배열 a와 b를 연결한 새로운 배열 리턴 */

        int c[]= new int[a.length+b.length];
        for(int i=0;i<c.length;i++ ) {
            if(i<a.length) {
                c[i]=a[i];
            }else{
                c[i]=b[i-a.length];
            }
        }
        return c;
    }
    public static void print(int[] a) {
        /* 배열 a 출력 */
    }
}
