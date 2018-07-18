package com.example.kelvin.notification_and_dialogue;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     // notification
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void notify(View view) {
        String message = "Hi guys";
        Intent open = new Intent(MainActivity.this,messageActivity.class);
        open.putExtra("message",message);
        PendingIntent pending = PendingIntent.getActivity(this,2000,open,0);
        Notification noti =new Notification.Builder(this).setContentIntent(pending).
                setContentTitle("new message").setSmallIcon(R.drawable.ic_launcher_foreground).
                setAutoCancel(true).build();
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(0,noti);

    }
    // dialogue
    public void dialog(View view) {
    }
}
