package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int redScore = 0;
    int redWarnings = 0;
    int blueScore = 0;
    int blueWarnings = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays red score.
     */
    public void displayRedScore(int i) {
        TextView redScore = (TextView) findViewById(R.id.red_player_score);
        redScore.setText(String.valueOf(i));
    }

    /**
     * Displays red warnings.
     */
    public void displayRedWarnings(int i) {
        TextView redWarnings = (TextView) findViewById(R.id.red_player_warnings);
        redWarnings.setText(String.valueOf(i));
    }

    /**
     * Increments red score by one.
     */
    public void redScoreIncrement(View view) {
        redScore++;
        displayRedScore(redScore);
    }

    /**
     * Increments red score by two.
     */
    public void redScoreTwo(View view) {
        redScore += 2;
        displayRedScore(redScore);
    }

    /**
     * Increments red score by three.
     */
    public void redScoreThree(View view) {
        redScore += 3;
        displayRedScore(redScore);
    }

    /**
     * Increments red warnings by one.
     */
    public void redWarnings(View view) {
        redWarnings++;
        displayRedWarnings(redWarnings);
    }

    /**
     * Displays blue score.
     */
    public void displayBlueScore(int i) {
        TextView blueScore = (TextView) findViewById(R.id.blue_player_score);
        blueScore.setText(String.valueOf(i));
    }

    /**
     * Displays blue warnings.
     */
    public void displayBlueWarnings(int i) {
        TextView blueWarnings = (TextView) findViewById(R.id.blue_player_warnings);
        blueWarnings.setText(String.valueOf(i));
    }

    /**
     * Increment blue score by one.
     */
    public void blueScore(View view) {
        blueScore++;
        displayBlueScore(blueScore);
    }

    /**
     * Increment blue score by two.
     */
    public void blueScoreTwo(View view) {
        blueScore += 2;
        displayBlueScore(blueScore);
    }

    /**
     * Increment blue score by three.
     */
    public void blueScoreThree(View view) {
        blueScore += 3;
        displayBlueScore(blueScore);
    }

    /**
     * Increment blue warnings by one.
     */
    public void blueWarnings(View view) {
        blueWarnings++;
        displayBlueWarnings(blueWarnings);
    }

    /**
     * Resets both players' points and warnings.
     */
    public void reset(View view) {
        redScore = 0;
        redWarnings = 0;
        blueScore = 0;
        blueWarnings = 0;

        displayRedScore(redScore);
        displayRedWarnings(redWarnings);
        displayBlueScore(blueScore);
        displayBlueWarnings(blueWarnings);
    }
}
