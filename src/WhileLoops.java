import java.util.Scanner;

public class WhileLoops {

    public static void main(String [] args) {

        //variable scope refers to a variable's
        //visibility
        int a = 2;
        int b = 0;
        //since a and b were declared in main(), they can be
        //used anywhere in main(), including if-statements
        //and loops

        if (a < 5) {
            //update the value of b
            b = 20;
            int c = 50;

            System.out.println("c is " + c);
        }

        System.out.println("a is " + a);
        System.out.println("b is " + b);

        //the scope of c is only within the if-statement
        //because that's where it was declared

//        System.out.println("c is " + c);

        int outcome = 0;
        if (a == b) {
            outcome = 2;
        }

        System.out.println(outcome);
        System.out.println();
        //loops let us run code repeatedly some number of times

        //while loops run when a condition remains true
        //(like repeating if-statements)

        int x = 0;
        while (x < 5) {
            System.out.println(x);

            //this is important because it will eventually
            //change the outcome of the condition to false
            //so that the loop will stop
            x++;

            //without that step, the termination condition
            //will never be met and an infinite loop occurs
            //-that's bad
        }

        //any code placed after the loop won't run until
        //the loop is complete
        System.out.println("loop has ended");

        //while loops are good for when you don't know how many
        //times you need to iterate (repeat the loop again)

        Scanner s = new Scanner(System.in);
        System.out.println("Enter quit to stop");
        String input = s.nextLine();
        int count = 1;

        while(!input.equals("quit")) {
            System.out.println("Enter quit to stop");
            input = s.nextLine();
            count++;
        }

        System.out.println("you were asked " + count +
                " times before you typed quit");


        System.out.println("Please enter a number: 1, 2, or 3");
        int num = s.nextInt();

        //validate the input (make sure it's valid - 1, 2, or 3)
        //when it's invalid, repeatedly ask them for a new number
        //until they put in something that's valid

        while((num != 1 && num != 2 && num != 3)) {

            //DeMorgan's law - when a boolean expression is
            //negated, you can distribute the ! and flip the
            //ands/ors
            // !(A or B) is the same as (!A and !B)
            // !(A and B) is the same as (!A or !B)
            //for the while loop condition:
            // !(num == 1 || num == 2 || num == 3)
            //is the same as
            //  (num != 1 && num != 2 && num != 3)

            System.out.println("invalid number");
            System.out.println("Please enter a number: 1, 2, or 3");
            num = s.nextInt();
        }

        System.out.println("good job");

    }

}
