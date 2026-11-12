import java.util.*;
public class PalindromeNumber {
    public static void palindrome(int num){
        int orig = num;
        int rev = 0;
        while(num>0){
            int dig = num%10;
            rev = rev*10+dig;
            num /= 10;
        }
        if(rev==orig){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palindrome(num);
    }
}
