package com.example.android.discovered;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView listenerButton, musicianButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set listener for click on listener button
        listenerButton = findViewById(R.id.listener_button);
        listenerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent listenerIntent = new Intent(MainActivity.this, listenerActivity.class);
                startActivity(listenerIntent);
            }
        });

        //set listener on musician button
        musicianButton = findViewById(R.id.musician_button);
        musicianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicianIntent = new Intent(MainActivity.this, musicianActivity.class);
                startActivity(musicianIntent);
            }
        });
    }
}
