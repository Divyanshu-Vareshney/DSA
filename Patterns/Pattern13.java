import java.util.Scanner;

public class Pattern13 {
    
    public static void nNumberTriangle(int n) {
        // Write your code here
        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nNumberTriangle(n);
    }
}
