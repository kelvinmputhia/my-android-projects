package com.kelvin.kingactivityintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class OffLineActivity extends AppCompatActivity {
    WebView webViewOffline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_line);
        webViewOffline = findViewById(R.id.wbOffline);
        WebSettings settings = webViewOffline.getSettings();
        settings.setJavaScriptEnabled(true);
        webViewOffline.loadUrl("file:///android_assets/index.html");
    }
}
