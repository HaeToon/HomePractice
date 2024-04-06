package practice03;

import java.util.Scanner;

public class MonthSchedule {
    private Scanner sc;
    private int num;
    private Day dayList[];
    public MonthSchedule(int num) {
        this.num = num;
        sc = new Scanner(System.in);
        dayList = new Day[num-1];
        for(int i=0; i<dayList.length; i++){
            dayList[i]=new Day();
        }
    }

    void run(){
        System.out.println("이번달 스케쥴 관리 프로그램을 실행합니다.");
        while(true){
            System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
            int menu = sc.nextInt();
            if(menu==3){
                finish();
                break;
            }else if(menu==1){
                input();
            } else if (menu==2){
                view();
            }else {
                System.out.println("잘못입력하셨습니다.");
            }

        }
    }
   private void input(){
        System.out.println("몇일?");
        int day = sc.nextInt();
        if(day>0 && day<num){
            System.out.println(day+"일에 할일을 입력해 주세요.");
            String todo = sc.next();
            dayList[day].set(todo);
        }else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
   private void view(){
        System.out.println("몇일?");
        int day = sc.nextInt();
        if(day>0 && day<num){
            System.out.println(day+"일에 할 일은");
            dayList[day].show();
        }else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
   private void finish(){
        System.out.println("종료합니다.");
    }
}
