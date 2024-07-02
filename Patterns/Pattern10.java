import java.util.Scanner;

public class Pattern10 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int m=0;m<n;m++){
            for(int j=0;j<n-m;j++){
                System.out.print("*");
            }
            for(int k=0;k<m;k++){
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
