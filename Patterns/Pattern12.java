import java.util.Scanner;

public class Pattern12 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }

            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }

            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }

            for(int l=i;l>=0;l--){
                System.out.print(l+1);
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
