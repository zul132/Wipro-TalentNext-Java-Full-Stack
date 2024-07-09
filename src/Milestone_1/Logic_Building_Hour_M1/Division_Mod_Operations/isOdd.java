package Milestone_1.Logic_Building_Hour_M1.Division_Mod_Operations;

import java.util.Scanner;

/*Write a function to find whether the given input number is Odd.
If the given number is odd, the function should return 2 else it should return 1.
Note: The number passed to the function can be negative, positive or zero. Zero should NOT be treated as odd.*/

public class isOdd {
	
	public static int isOdd(int n)
	{
		if(n % 2 != 0)
			return 2;
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		System.out.print(isOdd(n));
	}

}
