package Java_Fundamentals.Arrays;
/* Initialize an integer array with ascii values and print the corresponding character values in a single row. */

public class Ascii_to_Char {
	public static void asciiToChar(int[] ascii)
	{
		for (int i=0; i<ascii.length; i++)
			System.out.print((char)ascii[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ascii[] = {65, 72, 99, 111, 87};
		asciiToChar(ascii);
	}
}
