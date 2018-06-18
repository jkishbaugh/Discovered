package com.example.android.discovered;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class songActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Song1", "some Artist"));
        songs.add(new Song("song2", "anonymous"));
        songs.add(new Song("song3", "yet"));
        songs.add(new Song("song4", "database"));
        songs.add(new Song("again", "andAgain"));

        final SongAdapter songTitles = new SongAdapter(this, R.layout.song_list_item, songs);

        final ListView listview = findViewById(R.id.song_list);
        listview.setAdapter(songTitles);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song currentSong = (Song) listview.getItemAtPosition(position);
                String tempSongName = (String) currentSong.getSongTitle();
                String tempArtistName = (String) currentSong.getArtistName();

                Intent songIntent = new Intent(songActivity.this, NowPlayingActivity.class);
                songIntent.putExtra("key1", tempSongName);
                songIntent.putExtra("key2", tempArtistName);
                startActivity(songIntent);
            }
        });

    }
}
