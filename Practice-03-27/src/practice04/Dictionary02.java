package practice04;

public class Dictionary02 extends PairMap{

    private int length;
    private int count;


    public Dictionary02(int length) {
        this.length = length;
        keyArray = new String[length];
        valueArray = new String[length];
        count = 0;
    }

    @Override
    String get(String key) {
        for(int i=0; i<keyArray.length; i++) {
            if(key.equals(keyArray[i])) return valueArray[i];
        }
        return "값이 존재하지 않습니다.";
    }

    @Override
    void put(String key, String value) {
        //추가할건데 이미 존재하는 값이면 value값 수정
        int check = 0;

        for(int i=0; i<keyArray.length; i++) {
            if(key.equals(keyArray[i])) {
                valueArray[i] = value;
                check++;
            }
        }
        //존재하는 값이 아니면 새로 넣음.. 그리고 인덱스 추가
        if(check==0)  {
            keyArray[count] = key;
            valueArray[count] = value;
            count++;
        }


    }
    @Override
    String delete(String key) {
        for (int i=0; i<keyArray.length; i++) {
            if(key.equals(keyArray[i])) {
                keyArray[i] = null;
                valueArray[i] = null;
                count--;
            }
        }
        return null;
    }

    String show(String key) {
        for (int i = 0; i < keyArray.length; i++) {
            if(key.equals(keyArray[i])) return keyArray[i]+"의 값은 "+valueArray[i]+"입니다.";
        }

        return key+"의 값은 존재하지 않습니다.";
    }

    @Override
    int length() {
        return count;
    }
}
