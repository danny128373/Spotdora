package com.example.android.spotdora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DanielPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Daniel's Playlist. Song and Artist.
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Shape Of You", "Ed Sheeran"));
        songs.add(new Song("Slow Hands", "Niall Horan"));
        songs.add(new Song("There's Nothing Holding Me Back", "Shawn Mendes"));
        songs.add(new Song("It's My Life", "Bon Jovi"));
        songs.add(new Song("Master Of Puppets", "Metallica"));
        songs.add(new Song("Faded", "Alan Walker"));
        songs.add(new Song("Billie Jean", "Michael Jackson"));
        songs.add(new Song("The Sound Of Silence", "Disturbed"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}
