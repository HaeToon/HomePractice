package practice07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Practice05 {
    static boolean compare(FileInputStream fileInputStream01, FileInputStream fileInputStream02){
        byte buffer01[] = new byte[1024];
        byte buffer02[] = new byte[1024];
        int count01,count02;
        while(true){
            try {
               count01 = fileInputStream01.read(buffer01,0,buffer01.length);
               count02 = fileInputStream02.read(buffer02,0,buffer01.length);
               for(int i=0; i<count01; i++){
                   System.out.print(buffer01[i] + "/"+buffer02[i]+"|");
               }
               if(count01!=count02){
                   return false;
               }
               if(count01==-1)break;
               for(int i=0; i<count01; i++){
                   if(buffer01[i]!=buffer02[i]){
                       return false;
                   }
               }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream01 = new FileInputStream("C:\\Users\\gxg42\\Desktop\\study\\elvis01.txt");
            FileInputStream fileInputStream02 = new FileInputStream("C:\\Users\\gxg42\\Desktop\\study\\elvis02.txt");
            if(compare(fileInputStream01,fileInputStream02)){
                System.out.println();
                System.out.println("같다");
            }else {
                System.out.println();
                System.out.println("다르다");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
