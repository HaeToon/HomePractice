package practice04;

public class Won2Dollar extends Converter{
    private int dollar;

    public Won2Dollar(int dollar) {
        this.dollar = dollar;
    }

    @Override
    protected double convert(double srs) {
        return srs/dollar;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}
