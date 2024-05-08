import java.util.Scanner;

public class SumOfNParameter {
    public static void sumOfN(int n,int res){
        if(n==0){
            System.out.println(res);
            return;
        }
        sumOfN(n-1, res+n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumOfN(n,0);
    }
}
