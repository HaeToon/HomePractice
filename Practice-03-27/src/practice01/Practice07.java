package practice01;

import java.util.Scanner;

public class Practice07 {
    /*숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
   그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
   if-else 문과 switch 둘 다 이용해볼 것.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달이될 정수를 입력해 주세요.");
        String season=null;
        int num=scanner.nextInt();
        if(num>2 && num<6) {
            season="봄";
        }else if(num>5 && num<9) {
            season="여름";
        }else if(num>8 && num<12) {
            season="가을";
        }else if(num==12 || num>0&&num<3) {
            season="겨울";
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
        System.out.println(season);
    }
}
