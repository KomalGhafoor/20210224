package com.example.animation1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AudioMainActivity2 extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_main2);

     mp=MediaPlayer.create(this,R.raw.audio);
     mp.start();
    }

    public void Play(View view) {
        mp.start();
    }

    public void Pause(View view) {
       mp.pause();
    }
}