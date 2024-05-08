import java.util.Scanner;

public class printName {
    public static void printN(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Divyanshu");
        printN(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printN(1,n);
    }
}