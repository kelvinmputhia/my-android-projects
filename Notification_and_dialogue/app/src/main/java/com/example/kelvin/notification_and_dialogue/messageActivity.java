package com.example.kelvin.notification_and_dialogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class messageActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        text=findViewById(R.id.tvmessage);
        String message = getIntent().getStringExtra("massage");
        text.setText(message);
    }
}
