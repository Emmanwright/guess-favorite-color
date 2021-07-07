package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ask user to the question
        System.out.println("Guess my favorite color.");

        //store correct answer in variable correctAnswer.
        String correctAnswer = "red";

        //Create scanner named input to get users input
        Scanner input = new Scanner(System.in);

        //Store user input in the userInput variable to be used later and make userInput lowercase
        String userInput = input.nextLine().toLowerCase();


        //when userInput is NOT the same as correctAnswer, continue to run
        while (!userInput.equals(correctAnswer)) {
            System.out.println("That was wrong please try again.");
            System.out.println("Guess my favorite color.");

            //Ask user again and make userInput lowercase
            userInput = input.nextLine().toLowerCase();

        }
        System.out.println("Congrats! you guessed right.");

        //Close scanner to release memory and avoid memory leak in program.
        input.close();
