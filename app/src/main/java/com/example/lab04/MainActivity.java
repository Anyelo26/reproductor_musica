package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button play_pause;
    MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play_pause=(Button)findViewById(R.id.play_pause);
        media=MediaPlayer.create(this,R.raw.musica);
        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(media.isPlaying()){
                    media.pause();
                    play_pause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(MainActivity.this,"Pause",Toast.LENGTH_SHORT).show();
                }else{
                    media.start();
                    play_pause.setBackgroundResource(R.drawable.stop);
                    Toast.makeText(MainActivity.this,"Play",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
