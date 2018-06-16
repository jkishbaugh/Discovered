package com.example.android.discovered;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GenreAdapter extends ArrayAdapter<Genre> {
    public GenreAdapter(Activity context, int genre_list_item, ArrayList<Genre> genres) {
        super(context, 0, genres);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.genre_list_item, parent, false);
        }

        Genre currentGenre = getItem(position);

        TextView genreName = gridItemView.findViewById(R.id.genre_title);
        genreName.setText(currentGenre.getGenreName());

        ImageView genreImage = gridItemView.findViewById(R.id.genre_image);
        genreImage.setImageResource(currentGenre.getGenreImageId());

        return gridItemView;
    }

}
