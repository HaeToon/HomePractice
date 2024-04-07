package practice05;

public class Pracitce01 {
    public static void main(String[] args) {
        Point point01 =new Point(2,5);
        Point point02 =new Point(2,5);
        System.out.println(point01.toString());
        System.out.println(point02.toString());
        if(point01.equals(point02)){
            System.out.println("같은점");
        }else  {
            System.out.println("다른점");
        }
    }


}
