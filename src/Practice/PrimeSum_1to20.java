package Practice;

public class PrimeSum_1to20 {

	public static void main(String[] args) {
		// Sum of prime numbers from 1 to 20:
		
		int sum=0;

		for(int num=1;num<=20;num++) {
			
			boolean isPrime=true;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(num);
				sum= sum+num;	
			}
		}
		System.out.println("Sum of prime numbers is="+sum);
	}

}
