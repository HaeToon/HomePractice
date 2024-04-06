package practice04;

import java.util.Scanner;

class Add extends Calc {

    @Override
    public int calculate() {
        return a + b;
    }
}
// Queue   먼저 들어간거 먼저 나오기....


class Sub extends Calc {
    @Override
    public int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    @Override
    public int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    @Override
    public int calculate() {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 두개와 연산자를 쓰시오");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();
        Calc calc = null;
        if(operator.equals("+")){
            calc = new Add();
        } else if(operator.equals("-")) {
            calc = new Sub();
        } else if(operator.equals("*")) {
            calc = new Mul();
        } else {
            calc = new Div();
        }
        calc.setValue(a,b);
        int result = calc.calculate();
        System.out.println(result);
    }
}