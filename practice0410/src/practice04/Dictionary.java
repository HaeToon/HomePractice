package practice04;

import java.lang.reflect.ParameterizedType;

public class Dictionary extends PairMap{
   private int count=0;

    public Dictionary(int num) {
        keyArray = new String[num];
        valueArray = new String[num];

    }

    @Override
    String get(String key) {
        for(int i=0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){
                return valueArray[i];
            }
        }
        return "해당하는 값이 없습니다.";
    }

    @Override
    void put(String key, String value) {
        int check=0;
        for(int i=0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){
                valueArray[i]=value;
                check++;
            }
        }
        if(check==0){
         keyArray[count]=key;
          valueArray[count]=value;
           count++;
        }
    }

    @Override
    String delete(String key) {
        boolean isDelete =false;
        for(int i=0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){
                keyArray[i]=null;
                valueArray[i]=null;
                count--;
                isDelete=true;
            }
        }
        if(isDelete=false){
            System.out.println(key+"는 없습니다.");
        }
        return null;
    }

    @Override
    int length() {
        return count;
    }
}
