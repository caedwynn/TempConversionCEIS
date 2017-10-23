package com.example.ginac.tempconversionceis;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class SongActivity extends AppCompatActivity {
    private VideoView vidView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        vidView = (VideoView) findViewById(R.id.vidView);
        vidView.setMediaController(new MediaController(this)); //add media controller
        Uri video = Uri.parse("android.resource://" +getPackageName()+ "/"+ R.raw.freak);
        vidView.setVideoURI(video);
        vidView.setZOrderOnTop(true); //don't merge video with other widgets




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    protected void onResume() {
        super.onResume();
        vidView.start();
    }
    protected void onPause() {
        vidView.stopPlayback();
        super.onPause();
    }

}
