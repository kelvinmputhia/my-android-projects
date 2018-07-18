package com.example.kelvin.assignement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Online extends AppCompatActivity {
    WebView Online;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        Online =findViewById(R.id.online);
        WebSettings setting =Online.getSettings();
        setting.setJavaScriptEnabled(true);
        Online.loadUrl("https://www.emobilis.ac.ke");
    }
}

