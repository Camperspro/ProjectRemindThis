package com.example.projectcatchthis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: testing this, but Start HOMESCREEN

        //TODO: Create REMINDERS Page
        //TODO: Create LISTS Page
        //TODO: Create GROUPS Page
        //TODO: Create SETTINGS Page
        //TODO: Create NOTIFICATIONS Drop down menu
        //TODO: Create Calendar with a color or symbol indication for the event type on its set date
        //TODO: Create HOMESCREEN most 3 closet events section with date
    }

    public void OnNotificationsClick(View v) {
        TextView notif = findViewById(R.id.Tnotif);
    }

}
