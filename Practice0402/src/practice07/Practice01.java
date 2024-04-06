package practice07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\gxg42\\Desktop\\study\\study.txt");
        FileWriter fileWriter =null;
        try {
            fileWriter = new FileWriter(file);
            Scanner sc= new Scanner(System.in);
            while(true){
                System.out.println("이름 , 전화번호를 입력해 주세요 >>");
                String txt = sc.nextLine();
                if(txt.equals("그만"))break;
                fileWriter.write(txt+"\r\n");
            }
            sc.close();
            fileWriter.close();
            System.out.println("저장되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
