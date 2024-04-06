import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        /*컴퓨터와 독자 사이의 가위바위보 게임을 만들어보자. 예시는 다음 그림과 같다.
        독자부터 먼저 시작하여 가위 바위 보 중 하나를 입력하고 <Enter>키를 치면,
         프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 한다.
         독자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단한다.
         독자가 가위 바위 보 대신 "그만"을 입력하면 게임 Over

         컴퓨터와 가위 바위 보 게임을 합니다.

         가위 바위 보! >> 바위
          사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다

         가위 바위 보! >> 그만
          게임을 종료합니다...*/
        Scanner scanner = new Scanner(System.in);
        String Hand[] = {"가위", "바위", "보"};
        System.out.println("가위 바위 보 게임을 시작합니다.");
        while (true) {
            System.out.println("가위 바위 보! >>");
            String myHand = scanner.nextLine();
            if (myHand.equals("그만")) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            int ran = (int) (Math.random() * 3);
             String comHand=Hand[ran];
            System.out.println("플레이어 = " + myHand);
            System.out.println("컴퓨터 = " + comHand);
            if (myHand.equals(comHand)) {
                System.out.println("비겼습니다.");
            } else if (myHand.equals ("가위") && comHand .equals ("보") ||
                    (myHand .equals ("바위") && comHand .equals ("가위")) ||
                    (myHand .equals ("보") && comHand .equals ("바위"))) {
                System.out.println("플레이어가 이겼습니다.");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }

        }
    }
}
