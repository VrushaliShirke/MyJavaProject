package Practice;
import java.util.Scanner;
public class Check_Binary {

	public static void main(String[] args) {
		// Check number binary or not:
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		boolean isBinary=true;
		int r;
		
		while(num>0) {
			
			r=num%10;
			if(r>1||r<0) {
				isBinary=false;
				break;
			}
			num=num/10;
		}
		if(isBinary==true) {
			System.out.println("Binary");
		}
		else {
			System.out.println("Not binary");
		}
		sc.close();
	}

}
