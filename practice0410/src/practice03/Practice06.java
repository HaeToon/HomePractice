package practice03;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[]= new Circle[3];
        int big =0;
        for(int i=0; i<c.length; i++){
            System.out.println("x,y,radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i]=new Circle(x,y,radius);
            if(c[big].area()<c[i].area()){
                big=i;
            }
        }
        for(int i=0; i<c.length; i++){
            c[i].show();
        }
        System.out.println("가장 큰 면적의 원은");
        c[big].show();
    }
}