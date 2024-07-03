import java.util.Scanner;

public class Factors {
    public static void factor(int n){
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print(n/i+" ");
            }
        }
        System.out.println();
    }
    public static void factor2(int m){
        for(int i=1;i<=m;i++){
            if(m%i==0){
                System.out.print(i+" ");
            }
        }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factor(n);
        factor2(n);
    }
}
