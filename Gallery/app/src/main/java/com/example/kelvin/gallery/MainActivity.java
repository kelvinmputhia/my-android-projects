package com.example.kelvin.gallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView;
        gridView=findViewById(R.id.grid);

        gridView.setAdapter(new ImageAdapter(this));


    }
}
