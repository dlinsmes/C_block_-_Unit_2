import java.util.Scanner;

public class ForLoops {

    public static void main(String [] args) {
        //warm up - prompt the user for their favorite color out of
        //red, green, blue, or purple (or any set of 4 options)
        //and validate their input

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your favorite color: red, green," +
                " blue, or purple");
        String c = s.nextLine();

//        while(!(c.equals("red") || c.equals("green") ||
//                c.equals("blue") || c.equals("purple") )) {
        while( !c.equals("red") &&  !c.equals("green") &&
                !c.equals("blue") &&!c.equals("purple") ) {
            System.out.print("not a real color");
            System.out.println("Enter your favorite color: red, green," +
                    " blue, or purple");
            c = s.nextLine();
        }
        System.out.println("good job");

        //for loops
        //use when you can predetermine the number of iterations the
        //loop should run through

        //3 parts of a for loops:
        // initialization: int i = 0
        // condition: i < 10
        // increment: i++

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            //prints 0-9

            //the variable is assigned according to the initialization
            //step before the loop begins, then the condition is checked
            //to decide whether the loop should run
            //-after each iteration of the loop, the increment step runs,
            //then the condition is checked to decide whether to iterate
            //again
        }
        System.out.println();

        //variable scope - i is declared and accessible only within
        //the loop
        //System.out.println(i);

        for (int i = 4; i > 0; i--) {
            System.out.print(i + " ");
            //outputs 4, 3, 2, 1
        }
        System.out.println();

        //for loops can always be written as while loops and the other way
        //around, but usually one way is more elegant than the other
        //depending on the task

        //while loop that counts from 4 to 1:
        int j = 4;
        while (j > 0) {
            System.out.print(j + " ");
            j--;
        }

        //ask the user for 3 numbers using a loop,
        // then print the sum of numbers

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("enter a number");
            int n = s.nextInt();
            sum += n;
        }
        System.out.println("sum is " + sum);

        //ask the user what number they want multiples of
        //and also how many multiples to print
        System.out.println("What number do you want multiples of?");
        int mult = s.nextInt();
        System.out.println("How many multiples do you want printed?");
        int numMult = s.nextInt();

        for(int i = 1; i <= numMult; i++) {
            System.out.print(mult*i + " ");
        }
        System.out.println();

        for(int i = mult; i <= mult*numMult; i += mult) {
            System.out.print(i + " ");
        }
        System.out.println();

        //ask the user for a prime number
        //then use a loop to determine whether it's really prime or not
        //provide only one output at the end
        System.out.println("enter a prime number");
        int num = s.nextInt();

        //a number is prime if it is divisble by only 1 and itself

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            //loop through numbers [2, num)
            //to check divisibility
            if (num % i == 0) {
                //num was divisible by i
                //so num can't be prime
                isPrime = false;
            }
        }
        //same as isPrime == true
        if (isPrime) {
            System.out.println("number is prime");
        }
        //same as isPrime == false
        if (!isPrime) {
            System.out.println("number is not prime");
        }


    }
}
