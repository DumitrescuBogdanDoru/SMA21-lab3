package com.helloworld.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import com.helloworld.R;

import org.w3c.dom.Text;

public class IntentFilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_filter);
        setTitle("IntentFilterActivity");

        TextView textView = (TextView) findViewById(R.id.textView);
        Uri url = getIntent().getData();
        textView.setText(url.toString());
    }
}