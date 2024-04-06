package practice01;
import java.util.Scanner;
public class Practice07 {
    /*숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
   그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
   if-else 문과 switch 둘 다 이용해볼 것.*/
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("1~12의 숫자를 입력해 주세요.");
        int num=scanner.nextInt();
        String season =null;
        int i=0;
//        if(num>2 && num<6) {
//            season="봄";
//        }else if (num>5 && num<9) {
//            season="여름";
//        }else if (num>8 && num<12) {
//            season="가을";
//        }else if(num==12 || num>0 && num<3) {
//            season="겨울";
//        }else {
//            System.out.println("잘못입력하셨습니다.");
//        }
//        System.out.println(num+"월은"+season);
        switch(num) {
            case 3:
            case 4:
            case 5:
                season="봄";
                break;
            case 6:
            case 7:
            case 8:
                season="여름";
                break;
            case 9:
            case 10:
            case 11:
                season="가을";
                break;
            case 12:
            case 1:
            case 2:
                season="겨울";
                break;
            default:
                System.out.println("잘못입력했습니다.");
        }
        System.out.println(num+"월은"+season);
    }
}
