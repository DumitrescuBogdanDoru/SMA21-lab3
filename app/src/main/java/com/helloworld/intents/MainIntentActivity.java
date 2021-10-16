package com.helloworld.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.helloworld.R;
import com.helloworld.lifecycle.ActivityA;

public class MainIntentActivity extends AppCompatActivity {

    Button bGoogle;
    Button bTel;
    Button bLaunchGoogle;
    Button bLaunchTel;
    Button bLifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent);
        setTitle("Main Intent Activity");

        bGoogle = (Button) findViewById(R.id.bGoogle);
        bTel = (Button) findViewById(R.id.bTel);
        bLaunchGoogle = (Button) findViewById(R.id.bLaunchGoogle);
        bLaunchTel = (Button) findViewById(R.id.bLauchTel);

        bGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com"));
                startActivity(i);
            }
        });

        bTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:00401213456"));
                startActivity(i);
            }
        });


        bLaunchGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("MSA.LAUNCH",
                        Uri.parse("http://www.google.com"));
                startActivity(i);
            }
        });

        bLaunchTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("MSA.LAUNCH",
                        Uri.parse("tel:00401213456"));
                startActivity(i);
            }
        });

        bLifecycle = (Button) findViewById(R.id.lifecycleButton);

        bLifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityA.class));
            }
        });

    }
}