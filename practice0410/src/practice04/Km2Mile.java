package practice04;

public class Km2Mile extends Converter{
    public Km2Mile(double ratio) {
        this.ratio=ratio;
    }

    @Override
    protected double convert(double srs) {
        return srs/1.6;
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "Mile";
    }
}
