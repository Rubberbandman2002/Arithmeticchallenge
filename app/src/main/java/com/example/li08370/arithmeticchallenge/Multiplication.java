package com.example.li08370.arithmeticchallenge;
/*****************************************************************
 * Lucas Inouye
 * 9/21/18
 *
 * I made the equation vary in numbers from 1 to 10 because you learn 1 through 10 in elementary school
 *
 *
 * I made the choices by one number multiplied by another number within 2 of the second number
 * because  acoomon mistake among kids multiplying the correct numbers by each other.
 ****************************************************************/

public class Multiplication extends ArithmeticChallenge {
    int num1, num2;
    int option1, option2, option3;

    public Multiplication(int TOTAL_LEVELS, int TURNS_PER_LEVEL) {
        super(TOTAL_LEVELS, TURNS_PER_LEVEL);
    }

    protected String createQuestion() {
        num1 = (int) (11 * Math.random() + 1);
        num2 = (int) (11 * Math.random() + 1);
        String question = num1 + " x " + num2;
        return question;
    }


    protected int[] createChoices() {
        option1 = num1 * num2;
        do {
            if(num1 > 3)
                option2 = num1 * (int)  (Math.random() * ((num2 + 3) - (num1- 3)) + (num1 -3));
            else
                option2 = num1 *(int) (3 * Math.random() + num2);

        } while (option2 == option1);
        do {
            if(num1 > 3)
                option3 = num2 * (int)  (Math.random() * ((num1 + 3) - (num2 - 3)) + (num2 -3));
            else
                option3 = num2 * (int) (3 * Math.random() + num1);

        } while (option3 == option2 || option3 == option1 || option2 == option1);
        int[] Choices = {option1, option2, option3};
        return Choices;
    }
}