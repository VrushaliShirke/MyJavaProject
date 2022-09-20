package Practice;
import java.util.Scanner;
public class Loop_PalindromeNum {

	public static void main(String[] args) {
		// Palindrome numbers:
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int num1=num;
		int reverse=0;
		
		while(num>0) {
			int r=num%10;
			reverse=reverse*10+r;
			num=num/10;
		}
		if(reverse==num1) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrom");
		}
		sc.close();
	}

}
