public class NestedLoops {
    public static void main(String [] args) {

        //nested loops are where one loop can go in
        //another loop

        for (int i = 0; i < 5; i++) {

            //the inner loop should use a different
            //variable name

            //j iterates from 0-9 while i stays at the same value
            for (int j = 0; j < 10; j++) {
                System.out.println("hi - i is " + i
                + ", j is " + j);
                //hi will be printed 5 * 10 = 50 times

                //every time the outer loop runs one iteration,
                //the inner loop restarts and runs completely
            }
        }
        System.out.println();

        //nested loops can be used to display grids

        //the outer loop controls how many rows there are
        for (int i = 0; i < 4; i++) {

            System.out.print("row " + i + ": ");
            //inner loop controls how many values per row
            for (int j = 0; j < 8; j++) {
                //print on the same line for values within
                //a row
                System.out.print("x");
            }

            //println() AFTER the inner loop to create a line
            //break for the next row
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            //the inner loop depends which row you're on
            //(determined by i)
            for (int j = 0; j < i; j++) {
                System.out.print(j);
                //the quantity of values printed per row
                //depends on that row's i value
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            //the inner loop depends which row you're on
            //(determined by i)
            for (int j = 0; j < i; j++) {
                System.out.print(j);
                //the quantity of values printed per row
                //depends on that row's i value
            }
            System.out.println();

        }

    }
}
