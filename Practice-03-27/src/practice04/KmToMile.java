package practice04;

public class KmToMile extends Converter {
    public KmToMile(double ratio) {
        this.ratio=ratio;
    }
    @Override
    protected double convert(double src) {
        return src/ratio;
    }

    @Override
    protected String getSrcString() {
        return "km";

    }

    @Override
    protected String getDestString() {
        return "mile";
    }
    // 추상클래스는 생성자를 만들 수 없다.
    public static void main(String[] args) {
        KmToMile kmToMile = new KmToMile(1.60934);
        kmToMile.run();
    }
}
