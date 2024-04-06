import java.util.Scanner;
public class GradeTest {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("수학, 과학, 영어 점수를 입력해주세요.");
        System.out.println("수학 점수를 입력해주세요.");
        int math = scanner.nextInt();
        System.out.println("과학 점수를 입력해주세요.");
        int science = scanner.nextInt();
        System.out.println("영어 점수를 입력해주세요.");
        int english = scanner.nextInt();
        Grade myGrade = new Grade(math,science,english);
        System.out.println("세과목 점수의 평균은 "+myGrade.average()+"점 입니다.");
    }
}
