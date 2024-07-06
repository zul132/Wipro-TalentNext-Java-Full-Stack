package Java_Fundamentals.Flow_Control_Statements;
//Write a program to check if a given number is prime or not.

public class Prime_Number {
	
	public static void isPrime(int n)
	{
		int flag;
		if(n <=1) {
			flag = 0;	//not prime
		}else {
			flag = 1;	//may be prime
			for(int i=2; i<n; i++)
				for(int j=2; j<n; j++)
					if ((i*j) == n) {
						flag = 0;	//not prime
						break;
					}
		}
		if(flag == 1)
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not a prime number.");
	}
	
	public static void main(String[] args) {
		isPrime(31);
		isPrime(8);
		isPrime(1);
		isPrime(0);
	}
}

