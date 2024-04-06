package practice07;

import java.io.*;

public class Practice07 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gxg42\\Desktop\\study\\01.webp");
        File copy = new File("C:\\Users\\gxg42\\Desktop\\studyCopy\\01.webp");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(copy);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            long percent = file.length()/10;
            byte buffer[] = new byte[2];
            long process =0;
            int num=1;
            int c;
            while(true){
                c=fileInputStream.read(buffer,0,buffer.length);
                if(c==-1)break;
                if(c>0){
                    fileOutputStream.write(buffer,0,buffer.length);
                }
                process+=c;
                if(process>percent*num){
                    num++;
                    System.out.print("*");
                }
            }
//            while((c=fileInputStream.read())!=-1){
//                fileOutputStream.write(fileInputStream.read());
//            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
