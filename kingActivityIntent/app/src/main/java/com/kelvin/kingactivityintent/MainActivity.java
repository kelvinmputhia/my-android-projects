package com.kelvin.kingactivityintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonOffline;
    Button buttonOnline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOffline =findViewById(R.id.btnoffline);
        buttonOnline=findViewById(R.id.btnonline);
        buttonOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent offline = new Intent(MainActivity.this,OffLineActivity.class);
                startActivity(offline);
            }
        });
        buttonOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "Online clicked", Toast.LENGTH_SHORT).show();
                Intent Online =new Intent(MainActivity.this,OnlineActivity.class);
                startActivity(Online);
            }
        });

    }
}
