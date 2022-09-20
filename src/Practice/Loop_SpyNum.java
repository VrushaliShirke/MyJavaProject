package Practice;
import java.util.Scanner;
public class Loop_SpyNum {

	public static void main(String[] args) {
		// Spy Number:
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number:");
		int num= sc.nextInt();
		
		int sum=0;
		int product=0;
			
		while(num>0) {
			// Calculate sum and product of number:
			int r= num%10;
			sum= sum+r;
			product=product*r;
			num= num/10;
		}
		if(num==product) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not a spy number");
		}
		sc.close();
	}

}
