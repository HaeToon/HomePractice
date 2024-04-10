package practice02;

public class Practice01 {
    public static void main(String[] args){
        int sum=0;
        for(int i=0; i<100; i+=2){
            sum+=i;
        }
        System.out.println(sum);
        int i=0;
        int sum2 =0;
        while(i<100){
            sum2+=i;
            i+=2;
        }
        System.out.println(sum2);
    }
}
