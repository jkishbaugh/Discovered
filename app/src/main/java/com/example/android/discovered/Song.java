package com.example.android.discovered;

public class Song {
    private String mSongTitle;
    private String mArtistName;

    public Song(String songTitle, String artistName) {
        mSongTitle = songTitle;
        mArtistName = artistName;
    }

    /*
        method to get songTitle
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /*
    method to get artist name
     */
    public String getArtistName() {
        return mArtistName;
    }
}

