import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        /*Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라.
   다음은 5를 입력받았을 경우이다.
   정수를 입력하시오 >> 5
	*****
	****
	***
	**
	*    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해 주세요");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for(int j=0; j<num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
