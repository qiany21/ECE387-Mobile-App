package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayUpdate(View view) {
        incrementCounter();
    }

    public void incrementCounter(){
        counter++;
        TextView numberArea = (TextView) findViewById(R.id.counter);
        numberArea.setText(""+counter);
    }
}