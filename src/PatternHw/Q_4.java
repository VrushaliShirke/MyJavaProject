package PatternHw;

public class Q_4 {

	public static void main(String[] args) {
		int n=15;
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2;j++) {
				System.out.print("*");
			}
			n--;
			
			for(int a=1;a<=n;a++) {
				System.out.print(" ");
			}
			for(int b=n;b>=i*2;b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
