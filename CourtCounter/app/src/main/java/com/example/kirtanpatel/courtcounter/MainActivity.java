package com.example.kirtanpatel.courtcounter;

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
        //displayForTeamA(8);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsForTeamA(View v){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void twoPointsForTeamA(View v){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void onePointForTeamA(View v){
        scoreA++;
        displayForTeamA(scoreA);
    }

    public void threePointsForTeamB(View v){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void twoPointsForTeamB(View v){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void onePointForTeamB(View v){
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
