package practice06;

import java.util.*;

public class Practice02 {
    /* Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을
   문자로 입력받아 ArrayList에 저장하고, ArrayList를 검색하여
   학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
   평균을 출력하는 프로그램을 작성하라.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>arr=new ArrayList<>();
        System.out.println("6개의 학점을 빈칸으로 분리 입력");
       String txt = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(txt," ");
        String arrS[] = new String[st.countTokens()];
        double score=0;
        for(int i=0; i<6; i++){
            arrS[i]=st.nextToken();
            if(arrS[i].equals("A")){
                score+=4.0;
            }else if(arrS[i].equals("B")){
                score+=3.0;
            }else if(arrS[i].equals("C")){
                score+=2.0;
            }else if(arrS[i].equals("D")){
                score+=1.0;
            }else if(arrS[i].equals("F")){
                score+=0.0;
            }else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
        System.out.println("6개의 학점의 평균은" + score/6 +"입니다." );
    }
}
