package practice03;

import java.util.Scanner;

public class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future","hope"};
    private Scanner sc;

    public Dictionary() {
        sc = new Scanner(System.in);
    }
    public static String kor2Eng(String word) {
        /*검색 코드 작성*/
        for(int i=0; i<kor.length; i++){
            if(kor[i].equals(word)){
                return eng[i];
            }
        }
        return word+"는 사전에 없습니다.";
    }
    void run(){
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.println("검색할 한글단어는?");
            String search = sc.next();
            if(search.equals("그만")){
                System.out.println("종료합니다.");
                break;
            }
            System.out.println(kor2Eng(search));
        }
    }
}
