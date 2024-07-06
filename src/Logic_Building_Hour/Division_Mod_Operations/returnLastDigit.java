package Logic_Building_Hour.Division_Mod_Operations;

import java.util.Scanner;

/*Write a function that returns the last digit of the given number.
Last digit is being referred to the least significant digit i.e. the digit in the ones (units) place in the given number.
The last digit should be returned as a positive number.
for example,
if the given number is 197, the last digit is 7
if the given number is -197, the last digit is 7*/

public class returnLastDigit {
	public static int lastDigit(int n)
	{
		if (n > 0)
			return n % 10;
		else
			return -(n % 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		System.out.print(lastDigit(n));

	}

}
