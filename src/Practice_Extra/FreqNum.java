package Practice_Extra;

import java.util.Scanner;
import java.math.BigInteger;
public class FreqNum {

	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		BigInteger num= sc.nextBigInteger();
		int freq= sc.nextInt();
		int r=0,count=0,add=0;
		while(num.compareTo(num)>0) {
			System.out.println(add);
//			r=(num.compareTo(num)%10);
//			if(r==freq) {
//				count++;
//			}
//			int num1=(num.compareTo(num))/10;
//		}
//		System.out.println(count);
			 add=num.compareTo(num)+1;
			
		}
		System.out.println(add);
	}

}
