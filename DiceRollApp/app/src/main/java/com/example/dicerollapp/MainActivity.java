package com.example.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    Button button;

    Random random = new Random();
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.image1_view);
        imageView2 = findViewById(R.id.image2_view);
        button = findViewById(R.id.roll_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollForFirstImage();
                rollForSecondImage();
            }
        });
    }


    private void rollForFirstImage() {
        randomNumber = random.nextInt(6) + 1;
        switch (randomNumber) {
            case 1:
                imageView1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView1.setImageResource(R.drawable.dice6);
                break;
        }
    }

    private void rollForSecondImage() {
        randomNumber = random.nextInt(6) + 1;
        switch (randomNumber) {
            case 1:
                imageView2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice6);
                break;
        }
    }


}