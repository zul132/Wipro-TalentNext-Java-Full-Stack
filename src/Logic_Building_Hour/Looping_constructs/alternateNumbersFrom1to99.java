package Logic_Building_Hour.Looping_constructs;

//Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99

public class alternateNumbersFrom1to99 {

	public static void main(String[] args) {
		for(int i = 1; i<=99; i+=2)
		{
			System.out.print(i + " ");
		}
	}

}
