package com.example.android.spotdora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class song_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Never Stop", "Safety Suit"));
        songs.add(new Song("Good Old Days", "Macklemore"));
        songs.add(new Song("Sorry Not Sorry", "Demi Lovato"));
        songs.add(new Song("Perfect", "Ed Sheeran"));
        songs.add(new Song("Dancing On My Own", "Calum Scott"));
        songs.add(new Song("Talking To Myself", "Linkin Park"));
        songs.add(new Song("What About Us", "Pink"));
        songs.add(new Song("Heavy", "Linkin Park"));
        songs.add(new Song("How Long Will I Love You", "Ellie Goulding"));
        songs.add(new Song("Tin Man", "Miranda Lambert"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create song items for each item in the list.
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
