package practice02;

import java.util.Arrays;

public class practice07 {
    /*정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여
   배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.*/
    public static void main(String[] args) {
        int numArr[]=new int[10];
        int sum=0;
        int count=0;
        for(int i=0;i<numArr.length;i++) {
            numArr[i]=(int)(Math.random()*10+1);
            sum+=numArr[i];
            count++;
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println("숫자들의 평균은 "+sum/count);
    }



}
