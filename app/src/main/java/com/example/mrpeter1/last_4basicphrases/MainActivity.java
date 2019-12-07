package com.example.mrpeter1.last_4basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsatu,btndua, btntiga, btnempat, btnlima, btnenam, btntujuh, btndelapan;
    MediaPlayer mediaPlayer;
    AudioManager audioManager;

    public void play(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        mediaPlayer.start();

    }

    public  void playdua(View view){

        mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
        mediaPlayer.start();
    }

    public  void playtiga(View view){

        mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
        mediaPlayer.start();
    }

    public  void playempat(View view){

        mediaPlayer = MediaPlayer.create(this, R.raw.hello);
        mediaPlayer.start();
    }

    public  void playlima(View view){

        mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
        mediaPlayer.start();
    }

    public  void playenam(View view){

        mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
        mediaPlayer.start();
    }

    public  void playtujuh(View view){

        mediaPlayer = MediaPlayer.create(this, R.raw.please);
        mediaPlayer.start();
    }

    public  void playdelapan(View view){

        mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
        mediaPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
