import java.util.Scanner;
public class CircleManager {
    public static void main(String[] args){
        int big=0;
        Scanner scanner = new Scanner(System.in);
        Circle c[]=new Circle[3];
        for(int i=0; i<c.length;i++) {
            System.out.println("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i]= new Circle(x,y,radius);
            if(c[big].circleArea()<c[i].circleArea()) {
                big=i;
            }
        }

     System.out.print("가장 큰 면적의 원은 ");
     c[big].show();
//        for(int i=0; i<c.length;i++) {
//            c[i].show();
//        }
    }

}
