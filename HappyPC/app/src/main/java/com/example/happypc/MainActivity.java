package com.example.happypc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, InfoCompanyActivity.class);
        startActivity(intent);
    }

    public void onClickService(View view) {
        Intent intent = new Intent(MainActivity.this, ServiceActivity.class);
        startActivity(intent);
    }

    public void onClickContact(View view){
        Intent intent = new Intent(MainActivity.this, ContactsActivity.class);
        startActivity(intent);
    }
}