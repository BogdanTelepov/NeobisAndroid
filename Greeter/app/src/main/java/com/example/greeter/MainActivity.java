package com.example.greeter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText input_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_name = findViewById(R.id.inputName);
    }


    @SuppressLint("SetTextI18n")
    public void onClick(View view) {

        if (input_name.getText().length() == 0) {
            Toast toast = Toast.makeText(this, "Вы не ввели имя!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();
        } else if (input_name.getText().toString().matches("(?ui)[\\\\p{L}| ]")) {
            Toast toast = Toast.makeText(this, "Вы ввели некорректное имя!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();
        } else {
            TextView textView = findViewById(R.id.text_view);
            textView.setText("Hello, " + input_name.getText());
        }
    }
}