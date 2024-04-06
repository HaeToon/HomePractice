package practice07;

import java.io.*;

public class Practice06 {
    static void writeFile(FileReader fileReader, FileWriter fileWriter) throws IOException {
        char buffer[] = new char[64];
        int count=0;
        while(true){
            try {
                count=fileReader.read(buffer,0,buffer.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if(count==-1)break;
            if(count>0){
                fileWriter.write(buffer,0,count);
            }
        }
        fileReader.close();
//        fileWriter.close();
    }
    public static void main(String[] args) {
        File file01 = new File("C:\\Users\\gxg42\\Desktop\\study\\elvis01.txt");
        File file02 = new File("C:\\Users\\gxg42\\Desktop\\study\\elvis02.txt");
        File file03 = new File("C:\\Users\\gxg42\\Desktop\\study\\elvis03.txt");
        FileReader fileReader =null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(file01);
            fileWriter = new FileWriter(file03);
            writeFile(fileReader,fileWriter);
            fileReader = new FileReader(file02);
            writeFile(fileReader,fileWriter);
            fileWriter.close();
//            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
