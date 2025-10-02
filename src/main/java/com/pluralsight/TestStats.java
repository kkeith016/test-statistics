package com.pluralsight;

public class TestStats {
    public static void main(String[] args) {


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






