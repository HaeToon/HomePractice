package practice06;

import java.util.*;

public class LocationList {
    Scanner scanner = new Scanner(System.in);
    private Map<String,Location> locations = new HashMap<>();

    void run(){
        System.out.println("세계위상도를 작성합니다.");
        while(true) {
            System.out.println("1==저장 2==검색 3==종료");
            int menu = scanner.nextInt();
            if (menu == 3) {
                finish();
                break;
            }else if (menu==1){
                input();
            }else if(menu==2){
                search();
            }
        }
    }
    private void input(){
        System.out.println("도시이름과 위도 경도를 입력해주세요.(그만 입력시 종료)");
        while(true){
            System.out.println(">>");
            String name = scanner.next();
            if(name.equals("그만")){
                finish();
                break;
            }
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            Location location = new Location(name,x,y);
            locations.put(name,location);
        }
    }
    private void search(){
        while(true){
            System.out.println("도시이름을 입력해 주세요");
            String name = scanner.next();
            Location location = locations.get(name);
            if(name.equals("그만")){
                finish();
                break;
            }
            if(location !=null){
                System.out.println("도시 : "+location.getCity() + "위도 : "+ location.getX() + "경도 : "+ location.getY());
            }else {
                System.out.println(name + "은 저장되지않았습니다.");
            }
        }
    }
    private void finish(){
        System.out.println("종료합니다.");
    }
}
