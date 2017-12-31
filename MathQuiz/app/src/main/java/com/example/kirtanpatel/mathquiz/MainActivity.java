package com.example.kirtanpatel.mathquiz;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static android.R.attr.enabled;
import static com.example.kirtanpatel.mathquiz.R.id.answerOne;
import static com.example.kirtanpatel.mathquiz.R.id.answerThree;
import static com.example.kirtanpatel.mathquiz.R.id.answerTwo;
import static com.example.kirtanpatel.mathquiz.R.id.question;

public class MainActivity extends AppCompatActivity {

    String questionString = "What is the Capital of the United States";
    String answerOneString = "New York City";
    String answerTwoString = "Los Anglos";
    String answerThreeString = "Washington DC";
    int numOfQuestions = 0;
    int[] answers = {3,3,2,1,1};

    String questions[] = {"What is the Capital of the United States",
                        "What is the Capital of the United Kingdom",
                        "What is the Capital of India",
                        "What is the Capital of Canada",
                        "What is the Capital of Germany"};
    String answerString[][] = {{"New York City","Los Anglos","Washington DC"},
                                {"Wales","Ireland","London"},
                                {"Mumbai","New Deli","Madras"},
                                {"Ottawa","Vancouver","Qubece City"},
                                {"Berlin", "Hamburg", "Cologne"}};

    //RadioButton asdsa = (RadioButton) findViewById(R.id.answerThree);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView question = (TextView) findViewById(R.id.question);
        TextView question = (TextView) findViewById(R.id.question);
        Button answerOne = (Button) findViewById(R.id.answerOne);
        Button answerTwo = (Button) findViewById(R.id.answerTwo);
        Button answerThree = (Button) findViewById(R.id.answerThree);
        question.setText(questions[0]);

        //TextView answerOne = (TextView) findViewById(R.id.answerOne);
        answerOne.setText(answerString[0][0]);

        //TextView answerTwo = (TextView) findViewById(R.id.answerTwo);
        answerTwo.setText(answerString[0][1]);

        //TextView answerThree = (TextView) findViewById(R.id.answerThree);
        answerThree.setText(answerString[0][2]);
        //setNewSet(2);


    }

    public void setNewSet(int num){
            TextView question = (TextView) findViewById(R.id.question);
            Button answerOne = (Button) findViewById(R.id.answerOne);
            Button answerTwo = (Button) findViewById(R.id.answerTwo);
            Button answerThree = (Button) findViewById(R.id.answerThree);
        if(numOfQuestions<5) {
            question.setText(questions[num]);
            answerOne.setText(answerString[num][0]);
            answerTwo.setText(answerString[num][1]);
            answerThree.setText(answerString[num][2]);
        }
        else{
            answerOne.setEnabled(false);
            answerTwo.setEnabled(false);
            answerThree.setEnabled(false);
            question.setText("You Finished!");
            answerOne.setText("");
            answerTwo.setText("");
            answerThree.setText("");
        }
    }

    public void one(View view){
        if(answers[numOfQuestions] == 1){
            Toast toast = Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT);
            toast.show();
            numOfQuestions++;
            setNewSet(numOfQuestions);
            increaseQuestion(numOfQuestions);
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void two(View view){
        if(answers[numOfQuestions] == 2){
            Toast toast = Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT);
            toast.show();
            numOfQuestions++;
            setNewSet(numOfQuestions);
            increaseQuestion(numOfQuestions);
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void three(View view){
        if(answers[numOfQuestions] == 3){
            Toast toast = Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT);
            toast.show();
            numOfQuestions++;
            setNewSet(numOfQuestions);
            increaseQuestion(numOfQuestions);

        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void reset(View view){
        numOfQuestions = 0;
        TextView question = (TextView) findViewById(R.id.question);
        Button answerOne = (Button) findViewById(R.id.answerOne);
        Button answerTwo = (Button) findViewById(R.id.answerTwo);
        Button answerThree = (Button) findViewById(R.id.answerThree);
        question.setText(questions[0]);
        answerOne.setText(answerString[0][0]);
        answerTwo.setText(answerString[0][1]);
        answerThree.setText(answerString[0][2]);
        increaseQuestion(numOfQuestions);
        answerOne.setEnabled(true);
        answerTwo.setEnabled(true);
        answerThree.setEnabled(true);

    }

    public void increaseQuestion(int a){
        TextView inc = (TextView) findViewById(R.id.textCounter);
        inc.setText("Question " +a+ " of 5");
    }




}
