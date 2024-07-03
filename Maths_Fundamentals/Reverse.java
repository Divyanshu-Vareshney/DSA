import java.util.Scanner;

public class reverse {
    public static void rev(int n){
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rev(n);
    }
}
