package Practice_Extra;

public class PrimeNum_1to20 {

	public static void main(String[] args) {
		// 1 to 50 prime numbers:
		
		for(int num=1;num<=50;num++) {
			boolean isPrime=true;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
//				System.out.println(i);
			}
			if(isPrime==true) {
			System.out.println(num);
			}
		}
	}

}
