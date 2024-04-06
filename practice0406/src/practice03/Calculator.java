package practice03;

import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    Add add = new Add();
    Sub sub = new Sub();
    Mul mul = new Mul();
    Div div = new Div();

    void run(){
        System.out.println("두 정수와 연산자를 입력해 주세요.");
        int a =sc.nextInt();
        int b= sc.nextInt();
        String Operation = sc.next();
        if(Operation.equals("+")){
            add.setValue(a,b);
            System.out.println(add.calculator());
        }else if(Operation.equals("-")){
            sub.setValue(a,b);
            System.out.println(sub.calculator());
        }else if(Operation.equals("*")){
            mul.setValue(a,b);
            System.out.println(mul.calculator());
        }else if(Operation.equals("/")){
            div.setValue(a,b);
            System.out.println(div.calculator());
        }else{
            System.out.println("잘못입력했습니다.");
        }
    }
}
