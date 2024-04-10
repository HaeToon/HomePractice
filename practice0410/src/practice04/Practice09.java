package practice04;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("총 스택의 저장공간 입력.");
        int size = sc.nextInt();
        StringStack stringStack = new StringStack(size);

        while(true){
            System.out.println("문자열 입력 >>");
            String str =sc.next();
            if(str.equals("그만"))break;
            boolean over = stringStack.push(str);
            if(over==false){
                System.out.println("스택의 저장공간이 꽉차 더이상 입력 불가능");
                break;
            }
        }
        int end = stringStack.length();
        for(int i=0; i<end; i++){
            System.out.print(stringStack.pop()+" ");
            System.out.println("i==="+i);
            System.out.println("===stringStack.length()=="+stringStack.length());
        }
    }
}
