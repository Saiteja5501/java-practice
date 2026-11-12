import java.util.Scanner;

public class SumOfDigits {
    public static void sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int dig = n%10;
            sum += dig;
            n /= 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfDigits(n);
        
    }
}
