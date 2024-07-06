package Logic_Building_Hour.Conditional_statements;

//Write a program to accept a number N and print whether it is positive, negative or zero
import java.util.*;

public class isPositiveNegativeOrZero {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n > 0) {
			System.out.print("Positive");
		}
		else if (n < 0) {
			System.out.print("Negative");
		}
		else {
			System.out.print("Zero");
		}
		sc.close();
	}
}
