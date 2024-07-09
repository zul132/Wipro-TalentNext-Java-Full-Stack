package Milestone_1.Java_Fundamentals.Arrays;

import java.util.Scanner;
/* Write a program to initialize an array and print them in a sorted order. */

public class Print_Sorted_Array {
	public static void insertionSort(int arr[], int n)
	{
		//Using insertion sort
		int i,j,key;
		for(i=1; i<n; i++)
		{
			key = arr[i];
			j = i-1;
			while((j >= 0) && (arr[j] > key))
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		insertionSort(arr,n);
		System.out.println("Sorted array:");
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");

	}

}
