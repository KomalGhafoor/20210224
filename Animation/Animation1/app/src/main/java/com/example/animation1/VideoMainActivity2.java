package com.example.animation1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_main2);

        VideoView videoView =findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+ "/" + R.raw.video1);
        MediaController mediaController = new MediaController (this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}