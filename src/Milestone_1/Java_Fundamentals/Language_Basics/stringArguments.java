package Milestone_1.Java_Fundamentals.Language_Basics;

//Program that accepts two strings as command line arguments and generates the output in the required format

class stringArguments {
    public static void main(String[] args) {
        if (args.length == 2) {
            String s1 = args[0];
            String s2 = args[1];
            System.out.println(s1 + " Technologies " + s2);
        } else {
            System.out.println("Please provide two strings as command line arguments.");
        }
    }
}