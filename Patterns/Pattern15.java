import java.util.Scanner;

public class Pattern15 {
public static void pat(int n){
    int c=65;
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            char x=(char) (c+j);
            System.out.print(x);
        }
        System.out.println();
    }

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    pat(n);
}
}
