package com.pluralsight;

public class TestStats {
    public static void main(String[] args) {

        /* getting the average add all the numbers in a set together and
        then divide that sum by the total count of numbers in the set
         */

        int[] scores = {85, 92, 76, 81, 90, 68, 95, 60, 73, 84};

        //Calculating average
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / scores.length;

        //Finding the high score and low score

        int high = scores[scores.length - 1];
        int low = scores[0];

        for (int score : scores) {
            if (score > high) {
                high = score;
            }
            if (score < low) {
                low = score;
            }
        }
        System.out.println("-----Class Grades-----");
        System.out.println("Highest score: " + high);
        System.out.println("Lowest score: " + low);
        System.out.println("Average score: " + average);
    }
}


    /* creating a var named sum to store the total of all the score I choose to use a double
    because it may be a decimal

    then we will use a for loop to go though the array scores one at a time each time through the loop the score
    is stored in the var score.

     */





