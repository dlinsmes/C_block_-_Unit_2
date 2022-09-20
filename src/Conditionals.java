import java.util.Scanner;

public class Conditionals {
    public static void main(String [] args) {

        //simulate flipping a coin
        //then print out a result of heads or tails

        //-use a random number generator to generate
        //1 or 2
        //if 1 print heads, if 2 print tails

        int random = (int)(Math.random() * 2) + 1;
        System.out.println(random);

        //a conditional (if) statement checks whether
        //a condition is true, and if so, runs the
        //code in the curly braces
        if (random == 1) {
            System.out.println("you got heads");
        }
        //an optional else clause will run when the
        //condition for the if-statement right above it
        //is false
        else {
            System.out.println("you got tails");
        }

        //get input from the user for 3 numbers,
        //then output the biggest number of the 3
        Scanner s = new Scanner(System.in);


//        System.out.println("Enter 3 integers");
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int c = s.nextInt();
//
//        int max = 0;
//        if (a > b && a > c) {
//            max = a;
//        }
//        //the condition for checking b needs to be an else if
//        //else if clauses are used when you have multiple branches
//        //to check and you only want one of them to run
//        //-only the first branch that evaluates to true will
//        //run, and any other conditions afterward won't be
//        //checked
//        else if (b > a && b > c) {
//            max = b;
//        }
//        else {
//            max = c;
//        }
//        //if the condition for b was left as an if and not an
//        //else if, the program wouldn't run correctly becuase
//        //the first if-statement checking a will always
//        //run independently of the other two if/else branches
//
//        System.out.println("The biggest number is " + max);
//
//        s.nextLine();
        //since the previous input was numerical and we need
        //string input below this, add an extra nextLine() so
        //input doesn't get skipped

        //have the user enter a password and give feedback
        //for whether it's correct, has 0 length, has the
        //correct length, or is incorrect
        //-length refers to how many characters are in the string

        String realPW = "password123";
        System.out.println("enter the password");
        String userPW = s.nextLine();

        if(userPW.equals(realPW)) {
            System.out.println("you got it correct wow you're so smart");
        }
        //use .length() to see how many chars are in the string
        else if (userPW.length() == 0) {
            System.out.println("you didn't type anything dummy");
        }
        //int x = 10;
        //you can't have other code between if/else if/else
        else if (userPW.length() ==  realPW.length()) {
            System.out.println("nice try but NO");
        }
        else
            System.out.println("NO YOU'RE WRONG DUMDUM");
        //if you don't use curly braces for your if/else if/else
        //or loops, only the one single line that immediately
        //follows is considered the code to run for the if/else/loop

            System.out.println("this will always print");

        //user enters a number between 10 and 20 and
        //check whether the number meets those conditions
        System.out.println("enter a number between 10 and 20");
        int num = s.nextInt();

        //you can nest if statements, and when the outer
        //condition isn't true, the inner condition won't be
        //checked
        if (num > 10) {
            if (num < 20) {
                System.out.println("good job");
            }
            else {
                System.out.println("out of range - too high");
            }
        }
        else
            System.out.println("out of range - too low");

    }
}
