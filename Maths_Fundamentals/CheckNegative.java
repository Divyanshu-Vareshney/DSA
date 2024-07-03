import java.util.Scanner;

public class CheckNegative {
    public static void neg(int n){
        if(n<0){
            System.out.println("negative");
        }
        else{
            System.out.println("positive");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        neg(n);
    }
}
