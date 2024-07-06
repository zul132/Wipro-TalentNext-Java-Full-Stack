package Java_Fundamentals.Flow_Control_Statements;

/* Initialize a character variable in a program and
 * print 'Alphabet' if the initialized value is an alphabet,
 * print 'Digit' if the initialized value is a number, and
 * print 'Special Character' if the initialized value is anything else. */

public class printCharacterType {
	public static void displayCharacterType(char ch)
	{
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <='Z'))
			System.out.println("Alphabet");
		else if(ch >='0' && ch <='9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
	
	public static void main(String[] args) {
		displayCharacterType('f');
		displayCharacterType('T');
		displayCharacterType('7');
		displayCharacterType('-');
	}
}
