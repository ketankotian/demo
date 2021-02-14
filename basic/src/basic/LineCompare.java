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

		System.out.println("Enter value's of a1,b1; a2,b2 : ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		lineLength(x1, x2, y1, y2, a1, a2, b1, b2);

	}

	static void lineLength(int x1, int x2, int y1, int y2, int a1, int a2, int b1, int b2) {
		double line1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
//		System.out.println("length of line1 : " + line1);

		double line2 = Math.sqrt((a2 - a1) ^ 2 + (b2 - b1) ^ 2);
//		System.out.println("length of line2 : " + line2);

		if (line1 == line2)
			System.out.println("Length of Line 1 and Line 2 is equal ");
		else
			System.out.println("Line 1 and Line 2 are not equal");
	}

}
