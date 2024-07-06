package Logic_Building_Hour.Conditional_statements;

//Write a program to accept two numbers and print whether their sum is EVEN or ODD
import java.util.Scanner;

public class isSumEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		
		if(sum % 2 == 0)
			System.out.print("EVEN");
		else
			System.out.print("ODD");
	}

}
