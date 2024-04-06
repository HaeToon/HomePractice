package practice01;

import java.util.Scanner;

public class Practice04 {
    /* Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
   평균값을 구하는 것이 아님에 주의*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numarr[]=new int[3];
        System.out.println("정수 3개를 입력해 주세요.");
        for(int i=0; i<numarr.length;i++) {
            int num=scanner.nextInt();
            numarr[i]=num;
        }
        if(numarr[0]>numarr[1]&&numarr[0]<numarr[2] ||
        numarr[0]>numarr[2]&& numarr[0]<numarr[1]) {
            System.out.println("중간값은 "+numarr[0]);
        }else if (numarr[1]>numarr[0] && numarr[1]<numarr[2] ||
        numarr[1]>numarr[2] && numarr[1]<numarr[0]) {
            System.out.println("중간값은 "+numarr[1]);
        }else {
            System.out.println("중간값은 "+numarr[2]);
        }


    }
}
