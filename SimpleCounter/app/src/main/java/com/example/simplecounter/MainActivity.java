package com.example.simplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @SuppressLint("DefaultLocale")
    public void onClick(View view) {
        TextView textView = findViewById(R.id.text_view);
        count++;
        textView.setText(String.format("%04d", count));
    }

    @SuppressLint("DefaultLocale")
    public void reset(View view) {
        TextView textView = findViewById(R.id.text_view);
        count = 0;
        textView.setText(String.format("%04d", count));
    }
}