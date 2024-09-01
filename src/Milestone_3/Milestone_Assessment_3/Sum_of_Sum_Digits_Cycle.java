package Milestone_3.Milestone_Assessment_3;

import java.util.Scanner;
/*
    Program to find the Sum of Sum of Digits in a number in a Cyclic order.

    Input 0: 582109
    Sum of digits = ('5' + '8' + '2' + '1' + '0' + '9') + ('8' + '2' + '1' + '0' + '9') + ('2' + '1' + '0' + '9') + ('1' + '0' + '9')
                    + ('0' + '9') + (9)
                  = 85
    Output 0: 85

    Input 1: 1001
    Output 2: 5

    Input 2: 898546862
    Output 2: 248
 */
// Time Complexity: O(n2) where n is the number of digits in the input number
// Space Complexity: O(n)

public class Sum_of_Sum_Digits_Cycle {
  static int sumOfSumOfDigits(int n) {
    int sum = 0;
    // convert the given number to a string
    String numStr = "" + n;

    while (!numStr.isEmpty()) {
      sum += sumOfDigits(Integer.parseInt(numStr));
      numStr = numStr.substring(1);
    }

    return sum;
  }

  // helper function to find the sum of digits
  static int sumOfDigits(int x) {
    int s = 0;
    while (x != 0) {
      s += x % 10;
      x /= 10;
    }

    return s;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int result = sumOfSumOfDigits(num);
    System.out.println(result);

    sc.close();
  }
}
