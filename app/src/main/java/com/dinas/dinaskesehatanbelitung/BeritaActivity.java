package com.dinas.dinaskesehatanbelitung;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.IOException;

public class BeritaActivity extends AppCompatActivity implements View.OnClickListener {

    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;


    private Button Playmusic, Pause, Stop;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);




        mediaPlayer = MediaPlayer.create(BeritaActivity.this, R.raw.laguku);

        Playmusic = findViewById(R.id.playmusic);
        Pause = findViewById(R.id.pause);
        Stop = findViewById(R.id.stop);


        Playmusic.setOnClickListener(this);
        Pause.setOnClickListener(this);
        Stop.setOnClickListener(this);
        stateAwal();

        videoView = findViewById(R.id.video);
        playVideo = findViewById(R.id.play);
        mediaController = new MediaController(this);



        playVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);

                videoView.setVideoURI(uri);


                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);


                videoView.start();
            }
        });


    }

    private void stateAwal() {
        Playmusic.setEnabled(true);
        Pause.setEnabled(false);
        Stop.setEnabled(false);
    }


    private void playAudio() {
        mediaPlayer = MediaPlayer.create(this, R.raw.laguku);


        Playmusic.setEnabled(false);
        Pause.setEnabled(true);
        Stop.setEnabled(true);


        try{
            mediaPlayer.prepare();
        }catch (IllegalStateException ex){
            ex.printStackTrace();
        }catch (IOException ex1){
            ex1.printStackTrace();
        }
        mediaPlayer.start();


        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }




    @SuppressLint("SetTextI18n")
    private void pauseAudio() {

        if(mediaPlayer.isPlaying()){
            if(mediaPlayer != null){
                mediaPlayer.pause();
                Pause.setText("Lanjutkan");
            }
        }else {


            if(mediaPlayer != null){
                mediaPlayer.start();
                Pause.setText("Pause");
            }
        }

    }


    private void stopAudio() {
        mediaPlayer.stop();
        try {

            mediaPlayer.prepare();
            mediaPlayer.seekTo(0);
        }catch (Throwable t){
            t.printStackTrace();
        }
        stateAwal();
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playmusic:
                playAudio();
                break;

            case R.id.pause:
                pauseAudio();
                break;

            case R.id.stop:
                stopAudio();
                break;
        }
    }
    }



