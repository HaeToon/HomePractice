package practice03;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Reservation {
private String S[] = new String[10];
private String A[] = new String[10];
private String B[] = new String[10];
    int sitN =0;
Scanner sc;

    public Reservation() {
        sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            S[i]="ㅡ";
            A[i]="ㅡ";
            B[i]="ㅡ";
        }
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
            }else{
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }
    void reservation(){
        System.out.println("좌석구분 S(1), A(2), B(3)>>");
        int sit = sc.nextInt();
        if(sit==1){
            System.out.println("S의 좌석중 예약할 곳을 입력해주세요 1~10");
            System.out.println(Arrays.toString(S));
            sitN = sc.nextInt();
            if(!S[sitN].contains("ㅡ")){
                System.out.println("이미 예약된 자리입니다.");
            }else {
                String name = sc.next();
                S[sitN-1]=name;
            }
        }else if(sit==2){
            System.out.println("A의 좌석중 예약할 곳을 입력해주세요 1~10");
           System.out.println(Arrays.toString(A));
            sitN = sc.nextInt();
            if(!A[sitN].contains("ㅡ")){
                System.out.println("이미 예약된 자리입니다.");
            }else {
                String name = sc.next();
                A[sitN-1]=name;
            }
       }else if(sit==3){
            System.out.println("B의 좌석중 예약할 곳을 입력해주세요 1~10");
           System.out.println(Arrays.toString(B));
            sitN = sc.nextInt();
            if(!B[sitN].contains("ㅡ")){
                System.out.println("이미 예약된 자리입니다.");
            }else {
                String name = sc.next();
                B[sitN-1]=name;
            }
       }
    }
    void view(){
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡSㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println(Arrays.toString(S));
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡAㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println(Arrays.toString(A));
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡBㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println(Arrays.toString(B));

    }
    void cancel(){
        System.out.println("예약을 취소할 이름을 입력해 주세요");
       String name = sc.next();
       boolean isCancel=false;
       for(int i=0; i<10; i++){
           if(S[i].equals(name)){
               S[i]="ㅡ";
               isCancel=true;
           }else if(A[i].equals(name)){
               A[i]="ㅡ";
               isCancel=true;
           }else if(B[i].equals(name)){
               B[i]="ㅡ";
               isCancel=true;
           }
       }
       if(isCancel==false){
           System.out.println(name+"님은 예약자 명단에 없습니다.");
       }
    }
    void finish(){
        System.out.println("종료합니다.");
    }


}
