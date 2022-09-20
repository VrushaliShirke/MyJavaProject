package Practice_Extra;
import java.util.Scanner;
public class Prime_number {

	public static void main(String[] args) {
		// Prime Numbers:
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		boolean isPrime= true;
		
		int i=2;
		while(i<num) {
			if(num%i==0) {
				isPrime= false;
				break;
			}
			i++;
		}
		if(isPrime==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("not prime");
		}
		sc.close();
	}

}
