package Milestone_1.Java_Fundamentals.Flow_Control_Statements;

/* Initialize a character variable in a program.
   If the character value is in lowercase, the output should be displayed in uppercase in the following format.
   If the character value is in uppercase, the output should be displayed in lowercase in the following format.
*/

public class Uppercase_Lowercase {
	public static void switchCase(char ch)
	{
		if(ch >= 'a' && ch <='z')
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		else if(ch >= 'A' && ch <= 'Z')
			System.out.println(ch + "->" + Character.toLowerCase(ch));
		else
			System.out.println("Please provide a Character as input.");
	}

	public static void main(String[] args) {
		switchCase('f');
		switchCase('F');
	}
}
