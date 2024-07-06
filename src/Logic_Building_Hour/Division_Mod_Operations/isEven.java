package Logic_Building_Hour.Division_Mod_Operations;
import java.util.Scanner;

/*Write a function to find whether the given input number is Even.
If the given number is even, the function should return 2 else it should return 1.
Note: The number passed to the function can be negative, positive or zero. Zero should be treated as Even.*/

public class isEven {
	public static int isEven(int n)
	{
		if(n % 2 == 0)
			return 2;
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		System.out.print(isEven(n));
	}

}
