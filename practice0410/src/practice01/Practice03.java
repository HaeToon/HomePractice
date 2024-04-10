package practice01;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money[] = {50000,10000,5000,1000,500,100,50,10};
        System.out.println("교환할 돈을입력해주세요");
        int won = sc.nextInt();

        for(int i=0; i<money.length; i++){
            int rest = won/money[i];
            System.out.println(money[i]+"원"+rest+"개");
            won = won%money[i];
        }
    }
}
