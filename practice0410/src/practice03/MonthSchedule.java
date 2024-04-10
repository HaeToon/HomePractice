package practice03;

import java.util.Scanner;

public class MonthSchedule {
    private Day todoList[];
    private int days;
private Scanner sc= null;
    MonthSchedule(int days){
        todoList = new Day[days];
        for(int i=0; i<days; i++){
            todoList[i]=new Day();
        }
        sc = new Scanner(System.in);
    }
   private void input(){
        System.out.println("날짜? 1~"+days);
        int days = sc.nextInt();
        System.out.println("할일?");
        String todo = sc.next();
        todoList[days-1].set(todo);
    }
   private void view (){
        System.out.println("날짜? 1~30");
        int days = sc.nextInt();
        System.out.println(days+"일에 할일은 "+todoList[days-1].get()+"입니다.");
    }
   private void finish(){
        System.out.println("프로그램을 종료합니다.");
    }
    void run(){
        System.out.println("이번달 스케줄 관리 시스템 프로그램 시작");
        while(true){
            System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
            int menu =sc.nextInt();
            if(menu==3){
                finish();
                break;
            }else if(menu==1){
                input();
            }else if(menu==2){
                view();
            }else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}
