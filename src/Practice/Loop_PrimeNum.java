package Practice;
import java.util.Scanner;
public class Loop_PrimeNum {

	public static void main(String[] args) {
		// Prime number
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the number:");
		int num= sc.nextInt();
		boolean isPrime= false;
		
//		int i=2;
//		while(i<num) {
//			if(num%i==0) {
//				isPrime= true;
//				break;
//			}
//			i++;
//		}
//		if(isPrime==false) {
//			System.out.println("Prime number");
//		}
//		else {
//			System.out.println("Non-prime number");
//		}
//		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=true;
				break;
			}
		}
		
		if(isPrime==false) {
			System.out.println("prime");
		}
		else {
			System.out.println("non-prime");
		}
		sc.close();
	}

}
