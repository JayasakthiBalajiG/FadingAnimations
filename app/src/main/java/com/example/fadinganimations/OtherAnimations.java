package com.example.fadinganimations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class OtherAnimations extends AppCompatActivity {

    MediaPlayer ghostOne;

    public void FadeNext(View view){
        Log.i("Info","bart");
        ImageView bart  = (ImageView) findViewById(R.id.bartImage);
        bart.animate().scaleXBy(0.5f).scaleYBy(0.5f).alpha(0).setDuration(2000);
    }

    public void Play (View view){
        ghostOne.start();
    }

    public void Pause (View view){
        ghostOne.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_animations);
        ghostOne = MediaPlayer.create(this,R.raw.ghost);

        SeekBar volumeSeekBar = (SeekBar) findViewById(R.id.volumeSeekBar);
        volumeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                Log.i("Info",Integer.toString(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}