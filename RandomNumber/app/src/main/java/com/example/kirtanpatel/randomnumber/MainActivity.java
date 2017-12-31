package com.example.kirtanpatel.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int randomize(){
        int random = 0;
        random = (int)(Math.random()*100);
        return random;
    }

    public void randomButton(){
        TextView number = (TextView) findViewById(R.id.num);
        number.setText(String.valueOf(randomize()));
    }

    public void random(View view){
        randomButton();
    }
}
