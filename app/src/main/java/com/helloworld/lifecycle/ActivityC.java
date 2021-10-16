package com.helloworld.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.helloworld.R;

public class ActivityC extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ActivityC.class.getName();

    Button buttonA;
    Button buttonB;
    Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        setTitle("C");

        Log.d(TAG, "onCreate");

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonA:
                startActivity(new Intent(this, ActivityA.class));
                break;
            case R.id.buttonB:
                startActivity(new Intent(this, ActivityB.class));
                break;
            case R.id.buttonC:
                startActivity(new Intent(this, ActivityC.class));
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}