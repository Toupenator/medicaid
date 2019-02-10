package com.example.myapplication;

import android.app.Notification;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationCompat.Builder notification = new NotificationCompat.Builder(MainActivity.this)
                .setSmallIcon(R.drawable.caduceus_staff)
                .setContentTitle("Medicaid")
                .setContentText("Linda, its time to take your blood pressure pills")
                .setPriority(NotificationCompat.PRIORITY_MAX);
        notification.setDefaults(
                Notification.DEFAULT_ALL);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(MainActivity.this);
        notificationManager.notify(0, notification.build());
//        Button button = findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View w) {
//                NotificationCompat.Builder notification = new NotificationCompat.Builder(MainActivity.this)
//                        .setSmallIcon(R.drawable.caduceus_staff)
//                        .setContentTitle("Medicaid")
//                        .setContentText("Linda, its time to take your blood pressure pills")
//                        .setPriority(NotificationCompat.PRIORITY_MAX);
//                notification.setDefaults(
//                        Notification.DEFAULT_ALL);
//                 NotificationManagerCompat notificationManager = NotificationManagerCompat.from(MainActivity.this);
//                 notificationManager.notify(0, notification.build());
//            }
//        });
//       }
    }
}
