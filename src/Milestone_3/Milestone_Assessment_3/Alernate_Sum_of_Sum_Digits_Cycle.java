package Milestone_3.Milestone_Assessment_3;

import java.util.Scanner;

/* 
    Alternate solution to the Sum of Sum of Digits in a Cyclic order Logic Building Problem.

    Time Complexity: O(n2) where n is the number of digits in the input number
    Space Complexity: O(n)
*/

public class Alernate_Sum_of_Sum_Digits_Cycle {
    static int sumOfSumOfDigits(int n) {
        int sum = 0;
        String numStr = String.valueOf(n);

        for (int i = 0; i < numStr.length(); i++) {
            for (int j = i; j < numStr.length(); j++) {
                sum += Integer.parseInt(String.valueOf(numStr.charAt(j)));
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = sumOfSumOfDigits(num);
        System.out.println(result);

        sc.close();
    }

}
