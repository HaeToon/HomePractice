package practice07;

import java.io.*;

public class Practice0202 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        File file = new File("C:\\Users\\gxg42\\Desktop\\study\\study.txt");
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while(true) {
                String line = bufferedReader.readLine();
                if (line == null) break;
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
