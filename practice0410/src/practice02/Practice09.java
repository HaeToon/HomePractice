package practice02;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hand[] = {"가위","바위","보"};
        System.out.println("가위바위보게임을 시작합니다.");
        while(true){
            System.out.println("가위 바위 보!");
            String myHand = sc.next();
            String comHand = hand[(int)(Math.random()*3)];
            System.out.println("플레이어 == "+myHand + "컴퓨터 == "+comHand);
            if(myHand.equals("그만")){
                System.out.println("종료합니다.");
                break;
            }
            if(myHand.equals(comHand)){
                System.out.println("비겼습니다.");
            }else if(myHand.equals("가위") && comHand.equals("보") ||
            myHand.equals("바위") && comHand.equals("가위") ||
            myHand.equals("보") && comHand.equals("바위")){
                System.out.println("플레이어가 이겼습니다.");
            }else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
    }
}
