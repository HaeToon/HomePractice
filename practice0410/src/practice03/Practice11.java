package practice03;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두정수와 연산자를 입력하세요.");

        int a =sc.nextInt();
        int b=sc.nextInt();
        String operator = sc.next();

        if(operator.equals("+")){
            Add calc = new Add();
            calc.setValue(a,b);
            System.out.println(calc.calculate());
        }else if(operator.equals("-")){
            Sub calc = new Sub();
            calc.setValue(a,b);
            System.out.println(calc.calculate());
        }else if(operator.equals("*")){
            Mul calc = new Mul();
            calc.setValue(a,b);
            System.out.println(calc.calculate());
        }else if(operator.equals("/")){
            Div calc = new Div();
            calc.setValue(a,b);
            System.out.println(calc.calculate());
        }else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}
