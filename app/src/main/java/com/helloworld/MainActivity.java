package com.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eName;
    Button button;
    TextView tName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = (EditText) findViewById(R.id.eName);
        button = (Button) findViewById(R.id.button);
        tName = (TextView) findViewById(R.id.tName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = eName.getText().toString();
                tName.setText(String.format("Hello %s", name));
            }
        });
    }
}