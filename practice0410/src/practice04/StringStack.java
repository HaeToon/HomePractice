package practice04;

import java.util.Scanner;

public class StringStack implements Stack{
    Scanner sc = null;
       private String arr[];
       private int num;

    public StringStack(int size) {
        arr = new String[size];
        num=-1;
    }

    @Override
    public int length() {
        return num +1;
    }

    @Override
    public int compacity() {
        return arr.length;
    }

    @Override
    public String pop() {
        if(num==-1){
            return null;
        }
        String str = arr[num];
        num--;
        return str;
    }

    @Override
    public boolean push(String val) {
        if(num==arr.length-1){
            return false;
        }else {
            num++;
            arr[num]=val;
            return true;
        }
    }
}
