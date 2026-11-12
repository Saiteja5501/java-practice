import java.util.*;
public class CountDigits {
    public static void digits(int n){
        int count = 0;
        while(n>0){
            int dig = n%10;
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digits(n);
    }
}
