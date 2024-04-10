package practice03;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Reservation {
    private String S[]=new String[10];
    private String A[]=new String[10];
    private String B[]=new String[10];
private Scanner sc = null;

    public Reservation() {
sc= new Scanner(System.in);
        for(int i=0; i<10; i++){
           S[i]="ㅡ"+(i+1);
           A[i]="ㅡ"+(i+1);
           B[i]="ㅡ"+(i+1);

        }
    }
   private void reservation(){
        System.out.println("좌석구분 S(1), A(2), B(3)>>");
        int sit = sc.nextInt();
        if(sit==1){
            System.out.println(Arrays.toString(S));
            System.out.println("예약할 좌석번호를 입력해주세요");
            int sitNum = sc.nextInt();
            System.out.println(sitNum +"번에 예약하실분의 이름을 입력해주세요");
            String name = sc.next();
            S[sitNum-1]=name;
            System.out.println(Arrays.toString(S));
            System.out.println(name+"님 예약되었습니다.");
        }else if(sit==2){
            System.out.println(Arrays.toString(A));
            System.out.println("예약할 좌석번호를 입력해주세요");
            int sitNum = sc.nextInt();
            System.out.println(sitNum +"번에 예약하실분의 이름을 입력해주세요");
            String name = sc.next();
            A[sitNum-1]=name;
            System.out.println(Arrays.toString(A));
            System.out.println(name+"님 예약되었습니다.");
        }else if(sit==3){
            System.out.println(Arrays.toString(B));
            System.out.println("예약할 좌석번호를 입력해주세요");
            int sitNum = sc.nextInt();
            System.out.println(sitNum +"번에 예약하실분의 이름을 입력해주세요");
            String name = sc.next();
            B[sitNum-1]=name;
            System.out.println(Arrays.toString(B));
            System.out.println(name+"님 예약되었습니다.");
        }
    }
   private void view(){
        System.out.println("좌석구분 S(1), A(2), B(3)>>");
        int sit = sc.nextInt();
        if(sit==1){
            System.out.println(Arrays.toString(S));
        }else if(sit==2){
            System.out.println(Arrays.toString(A));
        }else if(sit==3){
            System.out.println(Arrays.toString(B));
        }else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
   private void cancel (){
        System.out.println("취소하실 예약자분의 이름을 입력해 주세요.");
        String cancelName = sc.next();
        boolean isCancel = false;
        for(int i=0; i<10; i++){
            if(S[i].equals(cancelName)){
                S[i]="ㅡ"+(i+1);
                isCancel=true;
            }else if(A[i].equals(cancelName)){
                A[i]="ㅡ"+(i+1);
                isCancel=true;
            }else if(B[i].equals(cancelName)){
                B[i]="ㅡ"+(i+1);
                isCancel=true;
            }
        }
        if(isCancel==false){
            System.out.println(cancelName+"님은 예약자명단에 없습니다.");
        }
    }
   private void finish(){
        System.out.println("종료합니다.");
    }
    void run(){
        System.out.println("콘서트 예약 프로그램입니다.");
        while(true){
            System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int menu = sc.nextInt();
            if(menu==4){
                finish();
                break;
            }else if(menu==1){
                reservation();
            }else if(menu==2){
                view();
            }else if(menu==3){
                cancel();
            }else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}
