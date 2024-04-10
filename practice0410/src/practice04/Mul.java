package practice04;

public class Mul extends Calc {
    private int a,b;

    @Override
    void setValue(int a, int b) {
        this.a=a;
        this.b=b;
    }

    @Override
    int calculate(int a, int b) {
        return a*b;
    }
}
