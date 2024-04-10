package practice01;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12사이의 수를 입력해 주세요");
        int num = sc.nextInt();
        String season="계절";
        if(num>2 && num<6){
            season="봄";
        }else if(num>5 && num<9){
            season="여름";
        }else if(num>8 && num<12){
            season="가을";
        }else if(num==12 || num<3 &&num>0){
            season="겨울";
        }else {
            System.out.println("잘못입력했습니다.");
        }
        System.out.println(season);
    }
}
