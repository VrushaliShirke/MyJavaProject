package PatternHw;

public class Q_2 {

	public static void main(String[] args) {
		// Pattern:
		
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int k=2*(n-i);k>=1;k--) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
