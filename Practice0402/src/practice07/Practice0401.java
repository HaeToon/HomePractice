package practice07;

import java.io.*;

public class Practice0401 {
    public static void main(String[] args) {
        File file = new File("c:\\windows\\system.ini");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            int i=1;
            while(true){
                String line = bufferedReader.readLine();
                if(line.equals(null))break;
                System.out.println(i+": "+line);
                i++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
