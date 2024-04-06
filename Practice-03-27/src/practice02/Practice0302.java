package practice02;

import java.util.Scanner;

public class Practice0302 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("정수를 입력해 주세요");
        int num = scanner.nextInt();

        for(int i=0; i<num; i++) {
            for(int k=0; k<num-i; k++) {
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
