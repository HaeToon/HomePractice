package practice03;

import java.util.Scanner;

public class PhoneBook {
    private int num;
    private String text;
    private String name;
    private String tel;
    Scanner scanner = new Scanner(System.in);
    Phone telList[];
    void run(){
        System.out.println("전화번호 저장 프로그램을 시작합니다.");
        while(true) {
            System.out.println("저장=1 찾기=2 종료 = 그만");
            text=scanner.next();
            if(text.equals("1")) {
                input();
            }else if(text.equals("2")) {
                search();
            }else if(text.equals("그만")) {
                finish();
                break;
            }else {
                System.out.println("잘못 입력 하셨습니다.");
            }
        }

    }
    void input() {
        System.out.println("저장할 인원수를 입력해 주세요");
        num = scanner.nextInt();
        telList= new Phone[num];
        for(int i=0; i<telList.length; i++) {
            System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            name = scanner.next();
            tel = scanner.next();
            telList[i]=new Phone(name,tel);
        }
        System.out.println(num + "개의 전화번호가 저장되었습니다.");
    }
    void search(){
        System.out.println("검색할 이름");
        name=scanner.next();
        boolean isSerch=false;
        for(int i=0; i<telList.length;i++) {
            if(name.equals(telList[i].getName())) {
                System.out.println(name + "님의 전화번호는"+telList[i].getTel()+"입니다.");
                isSerch=true;
            }
        }
        if(isSerch!=true) {
            System.out.println(name + "님은 전화번호부에 없습니다.");
        }

    }
    void finish(){
        System.out.println("전화번호 프로그램을 종료합니다.");
    }

}
