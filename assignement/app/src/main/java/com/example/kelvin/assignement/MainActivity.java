package com.example.kelvin.assignement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button webpage;
    Button Online;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webpage =findViewById(R.id.btnwebpage);
        Online=findViewById(R.id.btnonline);
        webpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent offline = new Intent(MainActivity.this,web_page.class);
                startActivity(offline);
            }
        });
        Online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(MainActivity.this, "Online clicked", Toast.LENGTH_SHORT).show();
                Intent Online =new Intent(MainActivity.this,Online.class);
                startActivity(Online);
            }
        });

    }
}


