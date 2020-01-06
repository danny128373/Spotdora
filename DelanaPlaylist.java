package com.example.android.spotdora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DelanaPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Daniel's Playlist. Song and Artist.
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Nobody But Me", "Michael Buble"));
        songs.add(new Song("Standing By", "Pentatonix"));
        songs.add(new Song("Unforgettable", "Thomas Rhett"));
        songs.add(new Song("In My Blood", "Shawn Mendez"));
        songs.add(new Song("New Rules", "Dua Lipa"));
        songs.add(new Song("I Got You", "Riverdale Cast"));
        songs.add(new Song("The Story Never Ends", "Lauv"));
        songs.add(new Song("Forever Now", "Michael Buble"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
