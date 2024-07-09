package Milestone_1.Logic_Building_Hour_M1.Division_Mod_Operations;

/*Write a function that returns the second last digit of the given number.
Second last digit is being referred to the digit in the tens place in the given number.
for example,if the given number is 197, the second last digit is 9

Note1 - The second last digit should be returned as a positive number.
i.e. if the given number is -197, the second last digit is 9

Note2 - If the given number is a single digit number, then the second last digit does not exist. In such cases, the function should return -1.
i.e. if the given number is 5, the second last digit should be returned as -1*/

public class returnSecondLastDigit {

	public static int seclastDigit(int n)
	{
		if (n >= 10)
			return (n / 10) % 10;
		else if (n <= -10)
			return -((n / 10) % 10);
		else
			return -1;
	}

	public static void main(String[] args) {
		System.out.println(seclastDigit(197));  //should return 9
		System.out.println(seclastDigit(-197)); //should return 9
		System.out.println(seclastDigit(7));   //should return -1
		System.out.println(seclastDigit(-7));  //should return -1

	}

}
