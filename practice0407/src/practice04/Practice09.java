package practice04;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("총 저장공간의 크기 입력.");
        int size = sc.nextInt();
        StackString stackString = new StackString(size);

        while(true){
            System.out.println("문자열 입력 >>");
            String str = sc.next();
            if(str.equals("그만")){
                break;
            }
           boolean over = stackString.push(str);
           if(over==false){
               System.out.println("stack이 꽉차 더이상 입력불가능");
               break;
           }
        }
        int end = stackString.length();
        System.out.println("end==="+end);
        for(int i=0; i<end; i++){
            System.out.print(stackString.pop()+" ");
            System.out.println("i==="+i);
            System.out.println("===stackString.length()"+stackString.length());
        }


    }
}
