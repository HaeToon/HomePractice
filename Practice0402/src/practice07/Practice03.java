package practice07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        File file = new File("c:\\windows\\system.ini");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.next().toUpperCase());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
