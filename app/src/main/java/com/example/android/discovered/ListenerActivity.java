package com.example.android.discovered;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class ListenerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Genre> genres = new ArrayList<Genre>();
        genres.add(new Genre("Blues", R.drawable.harmonica));
        genres.add(new Genre("Chrisitian", R.drawable.christian));
        genres.add(new Genre("Classical", R.drawable.classical));
        genres.add(new Genre("Country", R.drawable.country));
        genres.add(new Genre("Funk", R.drawable.funk));
        genres.add(new Genre("Hip Hop", R.drawable.music_radio_ghettoblaster));
        genres.add(new Genre("Indie", R.drawable.guitar));
        genres.add(new Genre("International", R.drawable.international));
        genres.add(new Genre("Jazz", R.drawable.trumpet));
        genres.add(new Genre("Kids", R.drawable.kids_music));
        genres.add(new Genre("Metal", R.drawable.metal));
        genres.add(new Genre("Pop", R.drawable.music_microphone_old));
        genres.add(new Genre("Punk", R.drawable.punk));
        genres.add(new Genre("R&B", R.drawable.rnb));
        genres.add(new Genre("Reggae", R.drawable.reggae));
        genres.add(new Genre("Rock", R.drawable.music_loudspeaker));

        GenreAdapter genreButtons = new GenreAdapter(this, R.layout.genre_list_item, genres);

        GridView gridView = findViewById(R.id.genre_list);

        gridView.setAdapter(genreButtons);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent genreIntent = new Intent(ListenerActivity.this, SongActivity.class);
                startActivity(genreIntent);
            }
        });
    }

}
