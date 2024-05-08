import java.util.Scanner;

public class printNameLinearly {
    public static void printNameL(int i,int n){
        if(i>n){
            return;
        }
        System.out.print("divyanshu ");
        printNameL(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNameL(1,n);
    }
}
