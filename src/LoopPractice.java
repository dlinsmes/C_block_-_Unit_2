import java.util.Scanner;

public class LoopPractice {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);

        //warm up - prompt the user for 5 numbers,
        //then output the biggest and smallest of the numbers

        //the program will only work if the input numbers are between
        //min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num = s.nextInt();

            //only need to keep track of two numbers - the min and the max
            //when the current number is less than/greater than the current
            //min/max, then update min/max to that new number
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        System.out.println("min is " + min + ", max is " + max);

        System.out.println("MIN_VALUE is " + Integer.MIN_VALUE);
        System.out.println("MAX_VALUE is " + Integer.MAX_VALUE);

        //if your integers go beyond the range of [MIN_VALUE, MAX_VALUE],
        //the values won't behave as expected

        //Integer.MIN_VALUE and MAX_VALUE hold the smallest and largest
        //possible integer values

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);

        System.out.println(Integer.MIN_VALUE - Integer.MAX_VALUE);

        //a string's length is how many characters it has
        String word = "apple";
        System.out.println("the length of " + word + " is " + word.length());


        //a substring is a part of a string indicated by the index (position)
        //of the part you want included
        //indexing starts with 0

        //for "apple":
        //a is index 0
        //p is index 1
        //etc

        //the last character of a string always has index length-1
        //because indexing starts at 0

        System.out.println("substring of " + word + " beginning " +
                "at index " + 2 + " is " + word.substring(2) );

        //substring() can also use two numbers to indicate the
        //beginning index and ending index, where the ending index
        //is exclusive (it goes up to but doesn't include index 5)
        System.out.println("substring starting at index 3 and" +
                "ending at but not including index 5 is "
                + word.substring(3, 5));

        //to isolate a single letter, use two consecutive numbers as indices
        System.out.println(word.substring(1, 2));

        //write code that will take a word and determine whether or not
        //it's a palindrome
        //-a palindrome is a word that's spelled the same forward and backward

        word = "racecar";
        //the number of letter comparisons to make is the length/2
        //where int division is beneficial because the middle letter
        //of odd-length words can be ignored

        boolean isPal = true;
        for (int i = 0; i < word.length()/2; i++) {
            //get a letter from the first half of the word and
            //get the letter from the mirror position from the
            //second half of the word to compare
            String letter1 = word.substring(i, i+1);
            String letter2 = word.substring(word.length()-1-i, word.length()-1-i+1);

            //if they don't match, the word isn't a palindrome
            if (!letter1.equals(letter2)) {
                isPal = false;
            }
        }

        if (isPal)
            System.out.println(word + " is a palindrome");
        else
            System.out.println("not a palindrome");
    }
}
