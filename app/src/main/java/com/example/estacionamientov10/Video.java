package com.example.estacionamientov10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    private VideoView vv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        int orientacion=getResources().getConfiguration().orientation;
        if(orientacion== Configuration.ORIENTATION_LANDSCAPE)
        {
            getSupportActionBar().hide();
        }
        else
            getSupportActionBar().show();

        vv01=findViewById(R.id.vv01);

        vv01.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video01));

        MediaController mc=new MediaController( this);
        vv01.setMediaController(mc);
        mc.setAnchorView(vv01);

        vv01.start();
    }
}