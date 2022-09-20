package Practice;
import java.util.Scanner;
public class Loop_PrimeCounter {

	public static void main(String[] args) {
		// Prime numbers using counter:
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int count=0;
		
//		int i=2;
//		while(i<num) {
//			if(num%i==0) {
//				count++;
//				break;
//			}
//			i++;
//		}
//		if(count==0) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("non-prime");
//		}

		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("non-prime");
		}
		sc.close();
	}

}
