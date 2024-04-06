package practice07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice0201 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gxg42\\Desktop\\study\\study.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
