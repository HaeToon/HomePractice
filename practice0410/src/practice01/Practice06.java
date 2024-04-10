package practice01;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("369게임을 시작합니다.");
        System.out.println("369 369 369 369 >>");
        int num = sc.nextInt();
        int first = num/10;
        int second = num%10;

        if(first!=0 && first%3==0 && second%3==0){
            System.out.println("짝짝");
        }else if(first!=0 && first%3==0 || second %3 ==0){
            System.out.println("짝");
        }
    }
}
