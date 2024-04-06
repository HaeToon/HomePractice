package practice02;

import java.util.Scanner;

public class practice0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0;i<num; i++) {
            for(int j=0; j<num-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
