import java.util.Scanner;

public class HCF {
    static void lcmAndGcd(Long A , Long B) {
        // code here
        long max=(A>=B) ? A:B;
        long hcf=1;
        long lcm=1;
        for(int i=1;i<=max;i++){
            if(A%i==0 && B%i==0 && A>=i && B>=i){
                hcf=i;
                lcm=lcm*hcf;
            }
            else  if((A%i==0 || B%i==0) && (A>=i && B>=i)){
                lcm=lcm*i;
            }
        }
        System.out.println(lcm);
        System.out.println(hcf);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        long B=sc.nextLong();
        lcmAndGcd(A,B);
    }
}
