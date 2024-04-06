package practice02;

public class practice01 {
    /*100보다 작은 짝수의 합을 구하는 코드를 작성하시오.
   for문과 while문으로 각각 작성하시오*/
    public static void main(String[] args) {
        int sum =0;
        int j=0;
//        for(int i=0; i<100;i+=2) {
//            sum+=i;
//        }
//        System.out.println(sum);
        while(j<100) {
            sum+=j;
            j+=2;
        }
        System.out.println(sum);
    }
}
