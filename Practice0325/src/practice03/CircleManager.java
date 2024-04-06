package practice03;
import java.util.Scanner;
public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big=0;
        Circle c[]=new Circle[3];
        for(int i=0;i<c.length; i++) {
            System.out.println("x,y,radius >>");
            double x= scanner.nextDouble();
            double y=scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i]= new Circle(x,y,radius);
            if(c[big].circleArea()<=c[i].circleArea()) {
                big=i;
            }
        }
        for(int i=0;i<c.length;i++) {
            c[i].show();
        }
        System.out.print("가장 큰 면적의 원은 ");
        c[big].show();
    }
}
