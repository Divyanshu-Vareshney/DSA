import java.util.Scanner;
import java.lang.Math;
public class Count {


    public static  void rev1(int n){
        int c=0;
        while(n>0){
            c=c+1;
            n=n/10;
        }
        System.out.println(c);
    }


    public static void count2(int m){
        int x=(int)Math.log10(m)+1;
        System.out.println(x);    
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rev1(n);
        int m=sc.nextInt();
        count2(m);
    }
}
