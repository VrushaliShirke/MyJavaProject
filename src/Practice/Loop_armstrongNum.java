package Practice;
import java.util.Scanner;
public class Loop_armstrongNum {
	public static void main(String[] args) {
		// Armstrong Number:
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int r;
		int product=0, num1=num;
		
		while(num>0) {
			r=num%10;
			product= product+r*r*r;
			num=num/10;
		}
		if(product==num1) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
		sc.close();	
	}
}
