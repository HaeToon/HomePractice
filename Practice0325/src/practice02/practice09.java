package practice02;
import java.util.Scanner;
public class practice09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String hand[]={"가위","바위","보"};

        while(true) {
            System.out.println("가위 바위 보! >>>");
            String myHand=scanner.next();
            String comHand=hand[(int)(Math.random()*3)];
            if(myHand.equals("그만")) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            System.out.println("플레이어가 낸것 "+myHand);
            System.out.println("컴퓨터가 낸것"+comHand);
            if(myHand.equals(comHand)) {
                System.out.println("비겼습니다.");
            } else if(myHand.equals("가위") && comHand.equals("보") ||
            myHand.equals("바위") && comHand.equals("가위") ||
                    myHand.equals("보") && comHand.equals("바위")) {
                System.out.println("플레이어가 이겼습니다.");
            }else {
                System.out.println("컴퓨터가 이겼습니다.");
            }


        }
    }
}
