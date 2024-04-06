package practice03;
import java.util.Scanner;
public class MonthSchedule {
    Scanner scanner =new Scanner(System.in);
private Day arr[];
    public MonthSchedule(int num) {
        arr=new Day[num];
        for(int i=0;i<arr.length;i++) {
            arr[i]=new Day();
        }
    }
    void run(){
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(true) {
            System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
            int num=scanner.nextInt();
            if(num==3) {
                finish();
                break;
            }else if(num==1) {
                input();
            }else if(num==2){
                view();
            }else {
                System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }
    void input(){
        System.out.println("날짜(1~30)?");
        int num=scanner.nextInt();
        System.out.println("할일(빈칸없이입력)?");
       String text = scanner.next();
        arr[num-1].set(text);

    }
    void view(){
        System.out.println("날짜(1~30)?");
        int num=scanner.nextInt();
        System.out.println(num+"일에 할일은"+arr[num-1].get()+"입니다.");
    }
    void finish(){
        System.out.println("종료합니다.");
    }

}
