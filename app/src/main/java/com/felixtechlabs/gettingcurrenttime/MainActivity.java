package com.felixtechlabs.gettingcurrenttime;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    TextView textCheckIn;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCheckIn = findViewById(R.id.inTime);


       // String currentDateAndTime = new SimpleDateFormat("HH:mm a").format(new Date());
        SimpleDateFormat dateFormat = new SimpleDateFormat(" hh.mm aa");
        String formattedDate = dateFormat.format(new Date()).toString();
        textCheckIn.setText((CharSequence) formattedDate);
        
    }
}
