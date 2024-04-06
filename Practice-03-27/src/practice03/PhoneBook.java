package practice03;

import java.util.Scanner;

public class PhoneBook {
   private Scanner scanner = new Scanner(System.in);
    private Phone telList[];
    public PhoneBook() {

    }

    void run() {
        System.out.println("전화번호부 프로그램을 실행합니다.");

        while(true) {
            System.out.println("저장하기==1 찾기==2 종료==3");
            int num = scanner.nextInt();
            if (num == 3) {
                finish();
                break;
            } else if (num == 1) {
                input();
            }else if(num==2){
                search();
            }else {
                System.out.println("잘못입력했습니다.");
            }
        }
    }

    void input() {
        System.out.println("인원수??");
        int num=scanner.nextInt();
        telList=new Phone[num];
        for(int i=0; i<telList.length;i++) {
            System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            System.out.println(i+1+"번째 저장할 이름을 입력해주세요");
            String name = scanner.next();
            System.out.println(name+"님의 전화번호를 입력해 주세요");
            String tel=scanner.next();
            telList[i]=new Phone(name,tel);
        }
        System.out.println(telList.length+"개의 전화번호가 입력되었습니다.");
    }

    void search() {
        System.out.println("검색할 이름 >>");
        String name = scanner.next();
        boolean isSearch = false;
        for(int i=0; i<telList.length;i++) {
            if(telList[i].getName().equals(name)){
                System.out.println(telList[i].getName()+"님의 전화번호는"+telList[i].getTel()+"입니다.");
                isSearch =true;
            }
        }
        if(isSearch==false){
            System.out.println(name+"님은 전화번호부에 없습니다.");
        }
    }
    void finish(){
        System.out.println("종료합니다.");
    }
}
