package practice06;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Practice01 {
    /*Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고
   벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new Vector<>();
        int big=0;
        System.out.println("정수 입력(-1입력시 종료)");
        while(true){
            int num = scanner.nextInt();
            if(num==-1){
                System.out.println("종료합니다.");
                break;
            }
            arr.add(num);
        }
        for(int i=0; i<arr.size();i++){
            if(arr.get(big)<arr.get(i)) {
                big=i;
            }
        }
        System.out.println("가장 큰 수는 "+arr.get(big));
    }
}
