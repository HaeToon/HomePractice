package practice06;

import java.util.*;

public class MoneyList {
    Scanner scanner = new Scanner(System.in);
    private Map<String,Double>moneyList = new HashMap<>();



    void run(){
        System.out.println("장학금관리시스템입니다.");
        for(int i=0; i<5; i++) {
            System.out.println("이름과 학점 >>>");
            String name = scanner.next();
            double score = scanner.nextDouble();
            moneyList.put(name,score);
        }
        System.out.println("장학생 선발기준 입력");
        double cutLine = scanner.nextDouble();
        Set<String>keyList = moneyList.keySet();
        Iterator<String> iterator = keyList.iterator();
        System.out.print("장학생은");
        while(iterator.hasNext()){
            String name = iterator.next();
            double score = moneyList.get(name);
            if(score>cutLine){
                System.out.print(name+"\t");
            }
        }
    }
}
