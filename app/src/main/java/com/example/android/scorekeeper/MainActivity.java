package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int redScore = 0;
    int blueScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays given score. Updates score for red if player == 1,
     * else for blue.
     */
    public void displayScore(int score, int player) {
        if (player == 1) {
            TextView redPlayerScore = (TextView) findViewById(red;
        }
    }

    /**
     * Increments score by one.
     */
    public void incrementScore(int score) {
        score++;
    }
}
