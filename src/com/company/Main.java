package com.company;
public class Main {

    public static void main(String[] args) {
        int guessedNumber = (int)(Math.random()*100);
        System.out.println("(The Number that Computer is thinking of is "+ guessedNumber +")");

        int highNumber = 100;
        int lowNumber = 0;
        int theNumber = 50;
        int cnt=1;
        System.out.println("Guess #" + cnt++ +" Is " + theNumber);

        while (theNumber != guessedNumber) {
            if (guessedNumber > theNumber){
                lowNumber = theNumber;
                System.out.println("Too Low");
            }
            if (guessedNumber < theNumber){
                highNumber = theNumber;
                System.out.println("Too High");
            }

            theNumber = (lowNumber + (highNumber - lowNumber) / 2);

            System.out.println("Guess #" + cnt++ + " is " + theNumber);
        }
        System.out.println("Wow! The number was " + theNumber);

        // In the simulation, 50 trial runs were taken. The average # of guesses per round is 6.
    }
}
