/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView numbers_view;
    TextView family_view;
    TextView colors_view;
    TextView phrases_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        numbers_view = (TextView) findViewById(R.id.numbers);
        family_view = (TextView) findViewById(R.id.family);
        colors_view = (TextView) findViewById(R.id.colors);
        phrases_view = (TextView) findViewById(R.id.phrases);

        numbers_view.setOnClickListener(this);
        family_view.setOnClickListener(this);
        colors_view.setOnClickListener(this);
        phrases_view.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.numbers:
                intent = new Intent(this, NumbersActivity.class);
                startActivity(intent);
                break;
            case R.id.family:
                intent = new Intent(this, FamilyActivity.class);
                startActivity(intent);
                break;
            case R.id.colors:
                intent = new Intent(this, ColorsActivity.class);
                startActivity(intent);
                break;
            case R.id.phrases:
                intent = new Intent(this, PhrasesActivity.class);
                startActivity(intent);
                break;
        }
    }
}
