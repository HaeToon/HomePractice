package practice04;

import java.util.Scanner;

public class StringStackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("총 스택 저장 공간의 크기 입력 >> ");
        int total = scanner.nextInt();

        StringStack stringStack = new StringStack(total);

        while(true) {
            System.out.print("문자열 입력 >>");
            String str = scanner.next();
            if(str.equals("그만")) {
                break;
            }
            boolean over = stringStack.push(str);
            if(over==false) {
                System.out.println("더 이상 입력 불가능");
                break;
            }
        }
//        System.out.println("==="+stringStack.length());
//        System.out.println("==="+stringStack.element[0]);
//        System.out.println("==="+stringStack.element[1]);
//        System.out.println("==="+stringStack.element[2]);ㄴ
        int end = stringStack.length();
        System.out.println("end==="+end);
        for(int i=0;i<end;i++) {
            System.out.print(stringStack.pop()+" ");
            System.out.println("i==="+i);
            System.out.println("===stringStack.length()"+stringStack.length());
        }
    }
}
