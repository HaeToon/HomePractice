package practice04;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 두개와 연산자를 입력해 주세요.");

        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator=sc.next();
        Calc calc=null;

        if(operator.equals("+")){
            calc=new Add();
        }else if(operator.equals("-")){
            calc=new Sub();
        }else if(operator.equals("*")){
            calc = new Mul();
        }else if(operator.equals("/")){
            calc = new Div();
        }
        calc.setValue(a,b);
        int result = calc.calculate();
        System.out.println(result);
    }

}
