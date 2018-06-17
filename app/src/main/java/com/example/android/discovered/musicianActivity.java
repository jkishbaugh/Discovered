package com.example.android.discovered;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class musicianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musician);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Genre> musicianMenu = new ArrayList<>();
        musicianMenu.add(new Genre("Edit Profile", R.drawable.profile));
        musicianMenu.add(new Genre("Find Collab", R.drawable.collab));
        musicianMenu.add(new Genre("Check stats", R.drawable.chart));
        musicianMenu.add(new Genre("Get Inspired", R.drawable.music_note_multiple));

        GenreAdapter musicianAdapter = new GenreAdapter(this, R.layout.genre_list_item, musicianMenu);

        GridView gridView = findViewById(R.id.musician_menu);

        gridView.setAdapter(musicianAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent musicianIntent = new Intent(musicianActivity.this, listenerActivity.class);
                startActivity(musicianIntent);
            }
        });
    }
}
