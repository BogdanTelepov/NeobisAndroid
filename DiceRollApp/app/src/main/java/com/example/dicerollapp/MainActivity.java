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
    int randomNumber1 = 0;
    int randomNumber2 = 0;
    static int firstDice = 0;
    static int secondDice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.image1_view);
        imageView2 = findViewById(R.id.image2_view);
        button = findViewById(R.id.roll_button);

        randomNumber1 = random.nextInt(6) + 1;
        randomNumber2 = random.nextInt(6) + 1;
        if (firstDice == 0 && secondDice == 0) {
            firstDice = getResources().getIdentifier("dice" + randomNumber1, "drawable", "com.example.dicerollapp");
            secondDice = getResources().getIdentifier("dice" + randomNumber2, "drawable", "com.example.dicerollapp");
        }
        imageView1.setImageResource(firstDice);
        imageView2.setImageResource(secondDice);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumber1 = random.nextInt(6) + 1;
                randomNumber2 = random.nextInt(6) + 1;
                firstDice = getResources().getIdentifier("dice" + randomNumber1, "drawable", "com.example.dicerollapp");
                secondDice = getResources().getIdentifier("dice" + randomNumber2, "drawable", "com.example.dicerollapp");

                imageView1.setImageResource(firstDice);
                imageView2.setImageResource(secondDice);
            }
        });
    }

    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt("image1_view", firstDice);
        outState.putInt("image2_view", secondDice);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        firstDice = savedInstanceState.getInt("image1_view");
        secondDice = savedInstanceState.getInt("image2_view");
    }


}