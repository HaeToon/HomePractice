package practice03;

public class Grade {
    private int math,science,english;
    Grade(int math,int science,int english){
        this.math=math;
        this.science=science;
        this.english=english;
    }
    int average(){
       return (math+science+english)/3;
    }
}
