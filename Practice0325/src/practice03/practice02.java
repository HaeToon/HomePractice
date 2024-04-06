package practice03;
import java.util.Scanner;
public class practice02 {
    /*Grade 클래스를 작성해보자. 3 과목의 점수를 입력받아 Grade 객체를 생성하고
   성적 평균을 출력하는 main()과 실행 예시는 다음과 같다.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수학, 과학, 영어 점수를 입력하세요.");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math,science,english);
        int avg = me.average();
        System.out.println("당신의 평균은 "+avg);
    }
}
