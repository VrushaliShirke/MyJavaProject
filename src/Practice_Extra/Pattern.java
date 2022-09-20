package Practice_Extra;

public class Pattern {
	public static void main(String[] args) {
		
		int i,j,k;
		
//		for(i=5;i>=1;i--) {
//			for(j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			for(k=1;k<i;k++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		int n=5;
		for(i=1;i<=n;i++) {
			for(k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=(n-i);j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
