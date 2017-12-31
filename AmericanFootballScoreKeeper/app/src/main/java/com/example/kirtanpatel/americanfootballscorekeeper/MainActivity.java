package com.example.kirtanpatel.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(score));
    }

    public void touchdownA(View v){
        scoreA+=6;
        displayForTeamA(scoreA);
    }

    public void touchdownB(View v){
        scoreB+=6;
        displayForTeamB(scoreB);
    }

    public void extraPointA(View v){
        scoreA++;
        displayForTeamA(scoreA);
    }

    public void extraPointB(View v){
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void twoPointA(View v){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void twoPointB(View v){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void fieldGoalA(View v){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void fieldGoalB(View v){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void safetiesA(View v){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void safetiesB(View v){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
