package practice04;

public class Km2Mile extends Converter {
    private double mile;

    public Km2Mile(double mile) {
        this.mile = mile;
    }

    @Override
    protected double convert(double srs) {
        return srs/mile;
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
