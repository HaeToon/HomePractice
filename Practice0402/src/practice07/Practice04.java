package practice07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        File file = new File("c:\\windows\\system.ini");
        try {
            Scanner sc = new Scanner(file);
            int a =1;
            while(sc.hasNext()){
                System.out.println(a+": "+sc.next());
                a++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
