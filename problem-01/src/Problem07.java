import java.util.Scanner;
public class Problem07 {
    public static void main(String[] args) {
        /*숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
   그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
   if-else 문과 switch 둘 다 이용해볼 것.*/
        Scanner scanner = new Scanner(System.in); {
            System.out.println("달을 입력해주세요.");
            int month = scanner.nextInt();
            String season;
            if (month>=3 && month<=5) {
                season="봄";
            }else if (month>=6 && month <=8) {
                season="여름";
            }else if (month>=9 && month <=11) {
                season="가을";
            }else {
                season="겨울";
            }
            System.out.println(month + "월은" +season+"입니다.");
            switch (month) {
                case 3:
                case 4:
                case 5:
                        season = "봄";
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
                    System.out.println("잘못 입력하셨습니다.");
            }
            System.out.println(month + "월은" +season+"입니다.");
        }
    }
}
