import java.util.Scanner;

public class printNameReverse {
    public static void printNameR(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printNameR(n-1);
    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNameR(n);
    }
}
