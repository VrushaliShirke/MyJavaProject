package Practice;
import java.util.Scanner;
public class Binary_Decimal {

	public static void main(String[] args) {
		// Binary to Decimal:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number:");
		int num= sc.nextInt();
		boolean isBinary=true;
		int copy=num;
		int r;
		while(num>0) {
			
			 r=num%10;
			if(r>1||r<0) {
				isBinary=false;
				break;
			}
			num= num/10;
			
		}
		
		if(isBinary==true) {
			System.out.println("Binary");
			num=copy;
			int p=0;
			int sum=0;
			while(num>0) {
				int digit=num%10;
				int power=(int)(Math.pow(2, p));
				int multi=power*digit;
				sum=sum+multi;
				p++;
				num=num/10;
			}
			System.out.println("Decimal number =" +sum);
		}
		else {
			System.out.println("not binary");
		}	
		sc.close();
	}

}
