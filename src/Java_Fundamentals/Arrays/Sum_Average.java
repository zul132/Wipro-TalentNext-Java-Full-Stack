package Java_Fundamentals.Arrays;

/* Write a program to initialize an integer array and print the sum and average of the array */

public class Sum_Average {
	
	public static void main(String[] args) {
		//Initialize an array of 10 integers 
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		//compute and print the sum of the array
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		System.out.println(sum);
		
		//compute and print the average of the array
		float avg = sum/10;
		System.out.println(avg);
		
	}
}
