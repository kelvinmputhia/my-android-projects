package com.example.kelvin.assignement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class web_page extends AppCompatActivity {
    WebView webpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);
        webpage = findViewById(R.id.web_page);
        WebSettings settings = webpage.getSettings();
        settings.setJavaScriptEnabled(true);
        webpage.loadUrl("file:///android_assets/index.html");
    }
}

