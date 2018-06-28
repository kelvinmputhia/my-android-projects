package com.kelvin.implicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button mOpenweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOpenweb=findViewById(R.id.btnopenwebpage);
        mOpenweb.OnClickListener
    }
}
