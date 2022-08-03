package com.example.fadinganimations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean tap=true;

    public void Fade(View view){
        Log.i("Info","bartTapped");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView jerryImageView = (ImageView) findViewById(R.id.jerryImageView);
        if(tap) {
            tap=false;
            bartImageView.animate().alpha(0).setDuration(2500);
            jerryImageView.animate().alpha(1).setDuration(2500);
        }
        else {
            tap=true;
            bartImageView.animate().alpha(1).setDuration(2500);
            jerryImageView.animate().alpha(0).setDuration(2500);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextAnimationsButton= findViewById(R.id.otherAnimationsButton);
        nextAnimationsButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,OtherAnimations.class);
            startActivity(intent);
        });

    }
}