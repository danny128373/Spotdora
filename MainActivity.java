
package com.example.android.spotdora;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_list.xml layout file
        setContentView(R.layout.activity_main);

        //Emily's playlist onClickListener
        TextView emily = (TextView) findViewById(R.id.emily_playlist);
        //Set a clicklistener on that View
        emily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open {@link song_list}
                Intent emilyIntent = new Intent(MainActivity.this, com.example.android.spotdora.song_list.class);
                //Start the new activity
                startActivity(emilyIntent);
            }
        });

        //Delana's playlist onClickListener
        TextView delana = (TextView) findViewById(R.id.delana_playlist);
        //Set a clicklistener on that View
        delana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open {@link DelanaPlaylist}
                Intent delanaIntent = new Intent(MainActivity.this, DelanaPlaylist.class);
                //Start the new activity
                startActivity(delanaIntent);
            }
        });

        //Daniel's playlist onClickListener
        TextView daniel = (TextView) findViewById(R.id.daniel_playlist);
        //Set a clicklistener on that View
        daniel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open {@link DanielPlaylist}
                Intent danielIntent = new Intent(MainActivity.this, DanielPlaylist.class);
                //Start the new activity
                startActivity(danielIntent);
            }
        });


    }

}