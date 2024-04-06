package practice06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PointList {
    Scanner scanner = new Scanner(System.in);
    private List<Point>pointList =new ArrayList<>();
    void run(){
        System.out.println("포인트 관리 프로그램입니다.");
        while(true){
            System.out.println("이름과 포인트 입력 >>");
            String name = scanner.next();
            int point = scanner.nextInt();
            pointList.add(new Point(name,point));

        }
    }
}
