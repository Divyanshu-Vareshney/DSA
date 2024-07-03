import java.util.Scanner;

public class Fact {
    static long sumOfDivisorsOfNumber(int i) {
        long sum = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                sum += j;
            }
        }
        return sum;
    }

    // Method to calculate the sum of the sum of divisors of all divisors of N
    static long sumOfDivisors(int N) {
        long totalSum = 0;
        for (int i = 1; i <= N; i++) {
                totalSum += sumOfDivisorsOfNumber(i);
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfDivisors(n));
    }
}
