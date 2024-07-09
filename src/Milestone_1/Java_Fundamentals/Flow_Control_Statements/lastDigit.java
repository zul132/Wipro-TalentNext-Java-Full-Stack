package Milestone_1.Java_Fundamentals.Flow_Control_Statements;

/* 
   Given two non-negative int values, print true if they have the same last digit, as with 27 and 57.
*/
class lastDigit {
    public static void isSameLastDigit(int num1, int num2) {
        if ((num1 % 10) == (num2 % 10))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static void main(String[] args) {
        isSameLastDigit(27, 57); // true
        isSameLastDigit(7, 17); // true
        isSameLastDigit(6, 17); // false
        isSameLastDigit(3, 113); // true
    }
}