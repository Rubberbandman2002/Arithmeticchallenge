package com.example.li08370.arithmeticchallenge;

public class Addition extends ArithmeticChallenge {
    @Override
    public int getScore(){
        return mScore;
    }

    public Addition(int TOTAL_LEVELS, int TURNS_PER_LEVEL){
        super(TOTAL_LEVELS, TURNS_PER_LEVEL);
    }

    protected String createQuestion(){
        // to be implemented
    }

    protected int[] createChoices(){
// to be implemented

    }

    public void setScore(int score) {
        mScore = score;
    }
    int mscore;
}

