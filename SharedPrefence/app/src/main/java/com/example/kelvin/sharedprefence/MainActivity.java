package com.example.kelvin.sharedprefence;

import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import java.lang.reflect.GenericArrayType;

public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.Toolbar mtoolbar;
    Button mred;
    Button mgreen;
    Button myellow;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtoolbar = findViewById(R.id.toolbar);
        mred = findViewById(R.id.btnred);
        mgreen = findViewById(R.id.btngreen);
        myellow = findViewById(R.id.btnyellow);

        mtoolbar.setTitle(getResources().getString(R.string.app_name));

        if (getColor() != getResources().getColor(R.color.colorPrimary)) ;
        mtoolbar.setBackgroundColor(getColor());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getColor());
        }


        mred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtoolbar.setBackgroundColor(getResources().getColor(R.color.colorRed));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    getWindow().setStatusBarColor(getResources().getColor(R.color.colorRed));

                }
                storeColors(getResources().getColor(R.color.colorRed));

            }
        });
        mgreen.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                mtoolbar.setBackgroundColor(getResources().getColor(R.color.colorgreen));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) ;
                {
                    getWindow().setStatusBarColor(getResources().getColor(R.color.colorgreen));
                }
                storeColors(getResources().getColor(R.color.colorgreen));


            }


        });
        myellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtoolbar.setBackgroundColor(getResources().getColor(R.color.coloryellow));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    getWindow().setStatusBarColor(getResources().getColor(R.color.coloryellow));

                }
                storeColors(getResources().getColor(R.color.coloryellow));

            }
        });
    }

    private void storeColors(int color) {
        SharedPreferences msharedPreferences = getSharedPreferences("ToolbarColor", MODE_PRIVATE);
        SharedPreferences.Editor mEditor = msharedPreferences.edit();
        mEditor.putInt("color", color);
        mEditor.apply();

    }

    private int getColor() {
        SharedPreferences msharedPreferences = getSharedPreferences("ToolbarColor", MODE_PRIVATE);
        int selectedColor = msharedPreferences.getInt("color", getResources().getColor(R.color.colorPrimary));
        return selectedColor;
    }

}
