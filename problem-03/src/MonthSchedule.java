import java.util.Scanner;
public class MonthSchedule {
    private Day dayList[];
    private Scanner scanner = null;
    MonthSchedule(int num) {
        dayList=new Day[num];
        scanner= new Scanner(System.in);
        for(int i=0; i<num; i++) {
            dayList[i]=new Day();
        }
    }
    void input(){
        System.out.println("날짜를 입력해 주세요");
        int num = scanner.nextInt();
        num--;
        System.out.println((num+1)+"일에 할일을 입력해 주세요");
        String work = scanner.next();
        dayList[num].set(work);
    }
    void view(){
        System.out.println("날짜를 입력해 주세요");
        int num = scanner.nextInt();
        num--;
        System.out.println((num+1)+"일에 할 일은");
        dayList[num].show();
    }
    void finish(){
        System.out.println("스케쥴 관리 프로그램을 종료합니다.");
    }
    void run(){
        while(true) {
            System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
            int num = scanner.nextInt();
            if(num==1) {
                input();
            } else if (num==2) {
                view();
            }else if (num==3) {
                finish();
                break;
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
