package Practice;

public class Loop_1to30 {

	public static void main(String[] args) {
		// Display numbers between 1 to 30 but skip numbers divisible by 2,3 and 9.
		
		int i;
		for(i=1;i<=30;i++) {
			if(i%2==0||i%3==0||i%9==0) {
	
				continue;
			}
			System.out.println(i);

		}
		
		//While Loop:
		
//		int i=1;
//		while(i<=30) {
//			if(i%2==0||i%3==0||i%9==0) {
//				i++;
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}

	}

}
