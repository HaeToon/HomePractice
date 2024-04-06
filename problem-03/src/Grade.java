public class Grade {
    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    private int math;
    private int science;
    private int english;

    int average() {
        return (math+science+english)/3;
    }

}
