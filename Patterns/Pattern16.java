import java.util.Scanner;

public class Pattern16 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        int c=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                char x=(char)(c+i);
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nLetterTriangle(n);
    }
}
