package practice07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice02 {
    public static void main(String[] args) {
        FileReader fileReader =null;
        File file = new File("C:\\Users\\gxg42\\Desktop\\study\\study.txt");
        try {
            fileReader=new FileReader(file);
            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
