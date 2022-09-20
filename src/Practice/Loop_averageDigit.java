package Practice;
import java.util.Scanner;
public class Loop_averageDigit {

	public static void main(String[] args) {
		// Average of Digits in a number:
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int sum=0;
		int count=0;
		float avgDigit=0f;
		
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			num=num/10;
			++count;
		}
		
//		for(int i=0;num>i;) {
//			int r=num%10;
//			sum=sum+r;
//			num=num/10;
//			++count;
//			
//		}
//	
		System.out.println("Sum of Digits="+sum);
		avgDigit=sum/count ;
		
		System.out.println("Average of Digits="+ avgDigit);
		
		sc.close();
	}

}