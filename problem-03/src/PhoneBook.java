import java.util.Scanner;
public class PhoneBook {
    Phone telList[];
    Scanner scanner = null;
    PhoneBook(){
        scanner= new Scanner(System.in);
    }
   void run(){
        while(true) {
            System.out.println("무엇을 도와드릴까요? 저장하기 = 1, 찾기 = 2, 끝내기 = 3)");
            int todo = scanner.nextInt();
            if (todo==1) {
                input();
            } else if (todo ==2) {
                search();
            } else if (todo ==3) {
                finish();
                break;
            } else {
                System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }
    void input(){
        System.out.println("저장할 인원수를 입력해 주세요");
        int num = scanner.nextInt();
        telList=new Phone[num];
        for(int i=0; i<telList.length;i++) {
            System.out.println((i+1)+"번째 저장할 이름을 입력해주세요.");
            String name = scanner.next();
            System.out.println(name + "님의 전화번호를 입력 해 주세요");
            String tel = scanner.next();
            telList[i]=new Phone(name,tel);
        }
        System.out.println(num + "개의 전화번호가 저장되었습니다.");
    }
    void search(){
        System.out.println("검색할 저장된 이름을 입력해주세요");
        String name = scanner.next();
        boolean find = false;
        for(int i =0; i<telList.length;i++) {
            if (name.equals(telList[i].name)) {
                System.out.println(name + "님의 전화번호는"+telList[i].tel+"입니다.");
                find = true;
            }
        }if(!find) {
            System.out.println(name + "님은 전화번호부에 없습니다.");
        }
    }
    void finish(){
        System.out.println("프로그램을 종료합니다.");
    }
}
