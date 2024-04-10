package practice04;

public class Won2Dollar extends Converter {
    public Won2Dollar(int ratio) {
this.ratio=ratio;
    }

    @Override
    protected double convert(double srs) {
        return srs/1200;
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
