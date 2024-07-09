package Milestone_1.Java_Fundamentals.Flow_Control_Statements;

/* Write a Java program to find if the given number is palindrome or not */
public class Is_Palindrome {
	public static void isPalindrome(int n) {
		int q = n;
		int r, rev = 0;

		while (q != 0) {
			r = q % 10;
			rev = (rev * 10) + r;
			q = q / 10;
		}

		if (n == rev)
			System.out.println(n + " is a palindrome");
		else
			System.out.println(n + " is not a palindrome");
	}	
	public static void main(String[] args) {
		if (args.length > 0) {
			int num = Integer.parseInt(args[0]);
			isPalindrome(num);
		} else {
			System.out.println("Please provide an integer number");
		}
	}
}
