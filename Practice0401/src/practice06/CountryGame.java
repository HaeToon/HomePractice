package practice06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryGame {
    Scanner scanner = new Scanner(System.in);
    Map<String,Integer>countryList= new HashMap<>();

   private void input(){
        System.out.println("나라이름과 인구를 입력하세요 ex)Korea 5000 (그만 입력시 중단)");
        while(true){
            System.out.println("나라 이름 , 인구 >>");
            String country = scanner.next();
            if(country.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }
            int people = scanner.nextInt();
            countryList.put(country ,people);
        }
    }
   private void search(){
       System.out.println("검색을 시작합니다.");
        while (true){
            System.out.println("인구 검색 (그만입력시 종료)>>");
            String answer = scanner.next();
            if(answer.equals("그만")){
                System.out.println("종료합니다.");
                break;
            }
            Integer num = countryList.get(answer);
            if(num!=null){
                System.out.println(answer + "의 인구는 " + countryList.get(answer));
            }else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }
   private void finish(){
        System.out.println("종료합니다.");
    }
    void run(){
        System.out.println("나라 맞추기 게임을 시작합니다.");
       while(true) {
           System.out.println("1==저장 2==검색 3==종료");
           int menu = scanner.nextInt();
           if (menu == 3) {
               finish();
               break;
           } else if (menu == 1) {
               input();
           } else if (menu == 2) {
               search();
           } else {
               System.out.println("잘못입력하셨습니다.");
           }
       }
    }

}
