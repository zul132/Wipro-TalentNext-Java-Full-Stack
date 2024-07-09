package Milestone_1.Java_Fundamentals.Flow_Control_Statements;
/* Write a program to print prime numbers between 10 and 99. */

public class Primes_from_10to99 {
	public static boolean isPrime(int n)
	{
		for(int i=2; i<n; i++)
			for(int j=2; j<n; j++)
				if((i*j) == n)
					return false;
		return true;
	}

	public static void main(String[] args) {
		for(int i = 10; i<99; i++)
			if(isPrime(i))
				System.out.print(i + "  ");
	}

}
