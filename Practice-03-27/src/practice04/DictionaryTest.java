package practice04;

import java.util.Arrays;

public class DictionaryTest {
    public static void main(String[] args) {
        Dictionary02 dic = new Dictionary02(5);
        //keyArray=[a,c,null,null,null]
        //valueArray=[aa,cc,null,null,null]

        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("장성호", "오라클");
        dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
        dic.delete("황기태"); // 황기태 아이템 삭제
        System.out.println("황기태의 값은 " + dic.get("황기태")); // 삭제된 아이템 접근
        System.out.println("장성호의 값은 " + dic.get("장성호")); // 삭제된 아이템 접근
        System.out.println("이재문의 값은 " + dic.get("이재문")); // 삭제된 아이템 접근
        System.out.println("length==="+dic.length());
        System.out.println(Arrays.toString(dic.keyArray));

    }
}
