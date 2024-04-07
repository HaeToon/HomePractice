package practice05;

public class Practice02 {
    public static void main(String[] args) {
        Circle c = new Circle(2,5,5);
        Circle b = new Circle(2,5,13);
        System.out.println(c.toString());
        System.out.println(b.toString());
        if(c.equals(b)){
            System.out.println("같은원");
        }else {
            System.out.println("다른원");
        }
    }



}
