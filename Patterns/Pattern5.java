import java.util.Scanner;

public class Pattern5 {
    public static void seeding(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        seeding(n);
    }
}
