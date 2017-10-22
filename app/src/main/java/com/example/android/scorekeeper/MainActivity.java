package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays red score.
     */
    public void displayRedScore(String message) {
        TextView redScore = (TextView) findViewById(R.id.red_player_score)
        redScore.setText(message);
    }

    /**
     * Displays red warnings.
     */
    public void displayRedWarnings(int i) {
        TextView redWarnings = (TextView) findViewById(R.id.red_player_warnings);
        redWarnings.setText(i);
    }

    /**
     * Displays blue score.
     */
    public void displayBlueScore(String message) {
        TextView blueScore = (TextView) findViewById(R.id.blue_player_score);
        blueScore.setText(message);
    }

    /**
     * Displays blue warnings.
     */
    public void displayBlueWarnings(int i) {
        TextView blueWarnings = (TextView) findViewById(R.id.blue_player_warnings);
        blueWarnings.setText(i);
    }
}
