package Java_Fundamentals.Flow_Control_Statements;

/* Write a program to reverse a given number and print */

public class Reverse_Number {
	
	public static void reverse(int n)
	{
		int q = n;
		int r, rev = 0;
		
		while (q != 0) {
			r = q % 10;
			rev = (rev * 10) + r;
			q = q /10;
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		//Example 1
		reverse(1234);
		//Example 2
		reverse(1004);
	}
}

