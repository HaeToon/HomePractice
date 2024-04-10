package practice02;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []unit={50000, 10000, 5000,1000,500,100,50,10};
        System.out.println("교환할 돈을 입력해주세요");
        int won = sc.nextInt();

        for(int i=0; i<unit.length; i++){
            int rest = won/unit[i];
            System.out.println(unit[i]+"원"+rest+"개");
            won=won%unit[i];
        }
    }
}
