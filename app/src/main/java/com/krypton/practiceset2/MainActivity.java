package com.krypton.practiceset2;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

//        display("default textview");
//        display(9);
//        display1("first textview");
//        display2("second textview");
//        display3("third textview");
//
//        int weekday = 5;
//        int weekend = 9;
//        int optimalHours = 7 * 8;
//
//        int actualHours = weekday;
//        actualHours = actualHours + weekend * 2;
//        int solution = optimalHours - actualHours;
//        display(solution);
    }

    public void saveScore(int score, String team){
        // TODO: 12/25/19 create function to save the scores in a text file...
    }


    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

//    public void display(String text) {
//        TextView t = (TextView) findViewById(R.id.display_text_view);
//        t.setText(text);
//    }
//
//    public void display(int text) {
//        TextView t = (TextView) findViewById(R.id.display_text_view);
//        t.setText(text + "");
//    }
//
//    public void display1(String text) {
//        display(text);
//    }
//
//    public void display2(String text) {
//        TextView t = (TextView) findViewById(R.id.display_text_view_2);
//        t.setText(text);
//    }
//
//    public void display3(String text) {
//        TextView t = (TextView) findViewById(R.id.display_text_view_3);
//        t.setText(text);
//    }

    /**
     * Displays the given score for Team A.
     */

    int ScoreA = 0,ScoreB = 0;
    public void displayForTeamA(int score) {
        ScoreA+=score;
        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        scoreView.setText(String.valueOf(ScoreA));
        //saveScore(ScoreA,"teamA");
    }


    public void A2(View v) {
        displayForTeamA(2);
    }


    public void A3(View v) {
        displayForTeamA(3);
    }

    public void displayForTeamB(int score) {
        ScoreB+=score;
        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        scoreView.setText(String.valueOf(ScoreB));
        //saveScore(ScoreB,"teamB");
    }


    public void B2(View v) {
        displayForTeamB(2);
    }


    public void B3(View v) {
        displayForTeamB(3);
    }


    public void resetA(View v){
        ScoreA=0;
        displayForTeamA(0);
    }


    public void resetB(View v){
        ScoreB=0;
        displayForTeamB(0);
    }
}