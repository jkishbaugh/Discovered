package com.example.android.discovered;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class nowPlaying extends AppCompatActivity {
    TextView songName, artistName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        songName = findViewById(R.id.song_name);
        artistName = findViewById(R.id.artist_name);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String clickedSongTitle = extras.getString("key1");
            songName.setText(clickedSongTitle);
            String clickedArtistName = extras.getString("key2");
            artistName.setText(clickedArtistName);
        }
    }
}
