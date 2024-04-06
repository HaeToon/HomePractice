package practice02;

public class Practice01 {
    /*100보다 작은 짝수의 합을 구하는 코드를 작성하시오.
   for문과 while문으로 각각 작성하시오.*/
    public static void main(String[] args){
        int sum =0;
        int sum2 =0;
        int i=0;
        for(int j =0; j<100 ;j+=2){
            sum+=j;
        }
        System.out.println(sum);
        while(i<100){
            sum2+=i;
            i+=2;
        }
        System.out.println(sum2);
    }

}
