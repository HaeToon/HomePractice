package practice04;

public class Dictionary extends PairMap{
int num=0;

    public  Dictionary(int size) {
        keyArray = new String[size];
        valueArray = new String[size];
    }

    @Override
    String get(String key) {
        for(int i=0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        int check =0;
        for(int i=0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){
                valueArray[i]=value;
                check++;
            }
        }
        if(check==0) {
            keyArray[num] = key;
            valueArray[num] = value;
            num++;
        }
    }

    @Override
    String delete(String key) {
        for(int i=0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){
                keyArray[i]=null;
                valueArray[i]=null;
                num--;
            }
        }
        return null;
    }

    @Override
    int length() {
        return num;
    }
}
