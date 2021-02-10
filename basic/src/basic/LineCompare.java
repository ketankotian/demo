package basic;

import java.util.Scanner;

public class LineCompare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value's of x1,y1; x2,y2 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		double line1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
//		System.out.println("length of line1 : " + line1);

		System.out.println("Enter value's of a1,b1; a2,b2 : ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();

		double line2 = Math.sqrt((a2 - a1) ^ 2 + (b2 - b1) ^ 2);
//		System.out.println("length of line2 : " + line2);

		if (line1 == line2)
			System.out.println("Line1 and Line2 are equal ");
		else
			System.out.println("Line1 and line2 are not equal");

	}

}
