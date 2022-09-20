package Practice_Extra;
import java.util.Scanner;
public class Num_Fact {

	public static void main(String[] args) {
		// 1 to 50
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number");
		int num= sc.nextInt();
		int i=1,sum=0,fact=1;
		for(i=1;i<=num;i++) {
				fact= fact*i;
				sum=sum+fact;
		}
		System.out.println(sum);
	}

}
