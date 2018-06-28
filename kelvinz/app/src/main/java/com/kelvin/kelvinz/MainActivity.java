package com.kelvin.kelvinz;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button call,sms,photo, simtoolkit ,share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call =findViewById(R.id.button);
        sms =findViewById(R.id.button3);
        photo =findViewById(R.id.button2);
        simtoolkit = findViewById(R.id.button4);
        share = findViewById(R.id.button5);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kk = new Intent(Intent.ACTION_DIAL);
                kk.setData(Uri.parse("tel:+25407542389"));
                startActivity(kk);

            }
        });
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mm = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(mm,0);
            }
        });
        simtoolkit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent louch =new Intent(getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.stk" ));
                if (louch!=null){
                    startActivity(louch);

                }
            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sms = new Intent(Intent.ACTION_MAIN);
                sms.setType("vnd.android-dir/mms-sms");
                startActivity(sms);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share =new Intent(Intent.ACTION_SEND);
                share.setType("plain/text");
                startActivity(Intent.createChooser(share,"Contact Us"));
            }
        });
    }
}
