package com.helloworld.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.helloworld.R;

public class MainIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent);
        setTitle("Main Intent Activity");
    }
}