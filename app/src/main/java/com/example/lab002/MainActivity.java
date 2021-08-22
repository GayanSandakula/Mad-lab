package com.example.lab002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;


import java.security.Provider;

public class MainActivity extends AppCompatActivity {
    private Button Button1,Button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1 = (Button) findViewById(R.id.button1);
        Button2 = (Button) findViewById(R.id.button2);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this,MyServices.class));

            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this,MyServices.class));
            }
        });


    }


}