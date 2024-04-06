package practice04;

import java.util.Arrays;

public class Dictionary extends PairMap {
    int count = 0;

    public Dictionary(int capacity) {
        keyArray = new String[capacity];
        valueArray = new String[capacity];

    }

    @Override
    String get(String key) {
        //키를 입력하면  value값이 나오면 된다.
        for (int i = 0; i < count; i++) {
            if (key.equals(keyArray[i])) {
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        //1. 중복이 있는 확인
        /*
        int check = 0;
        for(int i=0; i< keyArray.length; i++) {
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
        */
        int i = 0;
        for (i = 0; i < count; i++) {
            if (key.equals(keyArray[i])) {
                break;
            }
        }
        //발견이 안됨,,,, 중복 안됨
        if (i == count) {
            keyArray[i] = key;
            valueArray[i] = value;
            count++;
        } else {
            keyArray[i] = key;
            valueArray[i] = value;
        }


        //count++;
    }

    @Override
    String delete(String key) {
        int i = 0;
        //발견됨
        for (i = 0; i < count; i++) {
            if (key.equals(keyArray[i])) {
                break;
            }
        }
        System.out.println("i==="+i);
        //발견이 안됨,,,, 중복 안됨
        if (i == count) {
            return null;
        }
        //5 3개만 입력
        for (int j = i; j < count - 1; j++) {
            keyArray[j] = keyArray[j + 1];
            valueArray[j] = valueArray[j + 1];
        }
        //0부터 시작하기 때문에....
        count--;
        keyArray[count] = null;
        valueArray[count] = null;
        return valueArray[i];
        //한 칸앞으로 땡기기
    }

    @Override
    int length() {
        return count;
    }
}
