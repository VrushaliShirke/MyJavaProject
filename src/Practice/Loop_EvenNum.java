package Practice;

public class Loop_EvenNum {

	public static void main(String[] args) {
		// Display even numbers from 1 to 20 but skip numbers divisible by 3.
//		int i;
//		for(i=1;i<=20;i++) {
//			if(i%2==0) {
//				if(i%3==0) {
//					break;
//				}
//				System.out.println(i);
//			}
//			
//		}
		
//		int i;
//		for(i=20;i>=1;i--) {
//			if(i%2==0) {
//				if(i%3==0) {
//					break;
//				}
//				System.out.println(i);
//			}
//			
//		}
		
		// While Loop:
		
		int i=1;
		while(i<=20) {
			if(i%2==0) {
				if(i%3==0) {
//					System.out.println(i);
					break;
				}
				System.out.println(i);
			}
//			System.out.println(i);
			i++;
		}

	}

}
