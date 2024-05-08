import java.util.Scanner;

public class sumOfNFunctional {
    public static int sumOfNFunct(int n){
        if(n<0){
            return 0;
        }
        return n+sumOfNFunct(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfNFunct(n));
    }
}
