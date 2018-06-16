package com.example.android.discovered;

public class Genre {
    //Genre name
    private String mGenreName;
    // Genre image id
    private int mGenreImageId;

    public Genre(String genreName, int genreImageId) {
        mGenreName = genreName;
        mGenreImageId = genreImageId;
    }

    /*
       method that returns the Genre name
    */
    public String getGenreName() {
        return mGenreName;
    }

    /*
        method that returns the Genre image
     */

    public int getGenreImageId() {

        return mGenreImageId;
    }

}
