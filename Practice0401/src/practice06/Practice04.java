package practice06;

import java.util.*;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new Vector<>();
        int sum=0;
        while(true){
            System.out.println("강수량 입력 (0입력시 종료) >>");
            int num=sc.nextInt();
            if(num==0){
                System.out.println("종료합니다.");
                break;
            }
            arr.add(num);
            sum+=num;
                Iterator iterator = arr.iterator();
                while(iterator.hasNext()){
                    System.out.print(iterator.next()+"\t");
                }
            System.out.println();
            System.out.println("현재 평균은"+sum/arr.size());
        }
    }
}
