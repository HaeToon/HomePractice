package practice04;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc calc = null;
        System.out.println("정수2개와 연산자 입력");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String operator = sc.next();
        if(operator.equals("+")){
            calc=new Add();
        }else if(operator.equals("-")){
            calc=new Sub();
        }else if(operator.equals("*")){
            calc=new Mul();
        }else if(operator.equals("/")){
            calc=new Div();
        }
        calc.setValue(a,b);
        System.out.println(calc.calculate(a,b));
    }
}
