package practice01;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("10~99사이의 정수를 입력해 주세요");
        int num = sc.nextInt();
        int first = num/10;
        int second = num%10;
        if(first!=0 && first == second){
            System.out.println("10의자리와 1의자리가 같습니다."+num);
        }else {
            System.out.println("10의자리와 1의자리가 다릅니다."+num);
        }
    }
}
