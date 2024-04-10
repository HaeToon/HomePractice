package practice03;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[]= new Circle[3];
        for(int i=0; i<c.length; i++){
            System.out.println("x,y,radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i]=new Circle(x,y,radius);
        }
        for(int i=0; i<c.length; i++){
            c[i].show();
        }
    }
}
