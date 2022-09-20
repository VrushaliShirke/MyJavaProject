package Practice;
import java.util.Scanner;
public class Do__While_AreaSwitch {

	public static void main(String[] args) {
		// Write a program to select the area of circle,triangle, rectangle, square.
		Scanner sc= new Scanner(System.in);
		
		char ch;
		
		do {
			System.out.println("List of Shapes:");
			System.out.println("1.Circle\n2.Triangle\n3.Rectangle\n4.Square");
			int choice= sc.nextInt();
			float area;
			switch(choice) {
			case 1: 
				int radius= sc.nextInt();
				float PI=3.14f;
				area= PI*radius*radius;
				System.out.println("Area of circle="+area);
			break;
			case 2:
				int h=sc.nextInt();
				int b=sc.nextInt();
				area= (h*b)/2f;
				System.out.println("Area of triangle="+area);
			break;
			case 3:
				int l=sc.nextInt();
				int w=sc.nextInt();
				area=l*w;
				System.out.println("Area of rectangle="+area);
			break;
			case 4:
				int a=sc.nextInt();
				area=a*a;
				System.out.println("Area of square="+area);
			break;
			default: System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue...?");
			ch= sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		sc.close();
	}

}
