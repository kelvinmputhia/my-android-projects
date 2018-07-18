package com.kelvin.kingactivityintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class OnlineActivity extends AppCompatActivity {
     WebView webOnline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        webOnline =findViewById(R.id.webOnline);
        WebSettings setting =webOnline.getSettings();
        setting.setJavaScriptEnabled(true);
        webOnline.loadUrl("https://www.youtube.com");
    }
}
