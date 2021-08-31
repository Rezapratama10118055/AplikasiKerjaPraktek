package com.dinas.dinaskesehatanbelitung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.dinas.dinaskesehatanbelitung.adapter.adapterBerita;
import com.dinas.dinaskesehatanbelitung.model.model;
import com.dinas.dinaskesehatanbelitung.model.modelgambar;
import com.dinas.dinaskesehatanbelitung.model.myitem;

import java.io.IOException;
import java.util.ArrayList;

public class BeritaActivity extends AppCompatActivity  {

    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;


    private Button Playmusic, Pause, Stop;
    private MediaPlayer mediaPlayer;

    RecyclerView recyclerView2,Rec_gambar;

    RecyclerView.Adapter Adapterberita;
    RecyclerView.Adapter Adaptergambar;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<model> dataItem;
    private  ArrayList<modelgambar>datagambar;
    private ImageView imageAbout;
    private CardView btn_berita,btn_galeri,btn_struktur,btn_tentang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);






        //Berita
        recyclerView2 = findViewById(R.id.rec_beritalengkap);
        recyclerView2.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager);
        recyclerView2.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        dataItem = new ArrayList<>();
        for(int i = 0; i < myitem.nama.length; i++ ){
            dataItem.add(new model(myitem.images[i] ,myitem.nama[i] ,myitem.penjelasan[i],myitem.PenjelasanLengkap[i],myitem.akun[i],myitem.tanggal[i],myitem.katagori[i]));
        }
        Adapterberita = new adapterBerita(dataItem, this);
        recyclerView2.setAdapter(Adapterberita);



    }


}



