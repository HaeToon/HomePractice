package practice06;

public class Student {
    private String name , department;
    private int id ;
    private double score;

    public Student(String name, String department, int id, double score) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }
}
