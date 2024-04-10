package practice03;

import java.util.Scanner;

public class PhoneBook {
    private Phone telList[];
    private Scanner sc = null;
    PhoneBook(){
        sc= new Scanner(System.in);
        System.out.println("전화번호부 프로그램을 시작합니다.");
        System.out.println("인원수 입력");
        int num = sc.nextInt();
        telList = new Phone[num];
    }

    void input(){
        for(int i=0; i<telList.length; i++) {
            System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            System.out.println((i+1)+"번째 저장할 이름을 입력해 주세요");
            String name = sc.next();
            System.out.println(name+"님의 전화번호를 입력해주세요.");
            String tel = sc.next();
            telList[i]=new Phone(name,tel);
        }
        System.out.println(telList.length+"명이 저장되었습니다.");
    }
    void search(){
        System.out.println("검색할 이름 >>");
        String searchName = sc.next();
        boolean isSearch = false;
        for(int i=0; i<telList.length; i++){
            if(telList[i].getName().equals(searchName)){
                System.out.println(searchName+"님의 전화번호는 "+telList[i].getTel()+"입니다.");
                isSearch=true;
            }
        }
        if(isSearch==false){
            System.out.println(searchName+"님은 전화번호부에 없습니다.");
        }
    }
    void finish(){
        System.out.println("종료합니다.");
    }
    void run(){
        while(true) {
            System.out.println("(입력:1, 검색:2, 끝내기:3) >>");
            int menu = sc.nextInt();
            if(menu==3){
                finish();
                break;
            }else if(menu==1){
                input();
            }else if(menu==2){
                search();
            }else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}
