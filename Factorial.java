import java.util.Scanner;

public class Factorial {
    public static void factorial(int n){
        int prod = 1;
        for(int i=1;i<=n;i++){
            prod *= i;
        }
        System.out.println(prod);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        factorial(n);
    }
}
