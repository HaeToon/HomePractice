package practice01;

import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수2개와 연산자를 입력해주세요");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator = sc.next();

        if(operator.equals("+")){
            System.out.println("a+b="+(a+b));
        }else if(operator.equals("-")){
            System.out.println("a-b="+(a-b));
        }else if(operator.equals("*")){
            System.out.println("a*b="+(a*b));
        }else if(operator.equals("/") && b!=0){
            System.out.println("a/b="+(a/b));
        }else if(operator.equals("/") && b==0){
            System.out.println("0으로 나눌수없습니다.");
        }
    }
}
