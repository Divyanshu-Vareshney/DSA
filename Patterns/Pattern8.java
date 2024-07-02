import java.util.Scanner;

public class Pattern8 {
        public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*n-1-2*i;k++){
                System.out.print("*");
            }
            for(int l=0;l<=i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nStarTriangle(n);
    }
}
