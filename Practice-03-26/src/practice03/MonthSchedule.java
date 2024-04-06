package practice03;
import java.util.Scanner;
public class MonthSchedule {
    private int num;
    Day daylist[];
    Scanner scanner=new Scanner(System.in);
    public MonthSchedule(int num) {
        this.num = num;
        daylist=new Day[num];
        for (int i=0; i<num; i++) {
            daylist[i]= new Day();
        }
    }

    void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(true) {
            System.out.println("할일(입력:1, 보기:2, 끝내기:3)");
            num = scanner.nextInt();
            if(num ==1) {
               input();
            } else if( num==2) {
                view();
            }else if(num==3) {
                finish();
                break;
            }else {
                System.out.println("잘못 입력 하셨습니다.");
            }
        }

    }

    void input() {
        System.out.println("날짜(1~30)?");
        num=scanner.nextInt();
        System.out.println("할일(빈칸없이입력)?");
        String text = scanner.next();
        daylist[num-1].set(text);
    }

    void view() {
        System.out.println("날짜(1~30)?");
        num=scanner.nextInt();
        System.out.print(num-1+"일날 할 일은");
        daylist[num-1].show();
    }

    void finish() {
        System.out.println("월계획표를 종료합니다.");
    }

}
