package com.example.android.spotdora;

/**
 * {@Link Song} represents the song the user wants to hear.
 * It contains song name and artist.
 */
public class Song {
    /**
     * Artist of the song
     */
    private String mArtist;

    /**
     * Song name
     */
    private String mSong;

    public Song(String song, String artist) {
        mSong = song;
        mArtist = artist;
    }

    /**
     * Get the artist of the song.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the song name.
     */
    public String getSong() {
        return mSong;
    }


}

