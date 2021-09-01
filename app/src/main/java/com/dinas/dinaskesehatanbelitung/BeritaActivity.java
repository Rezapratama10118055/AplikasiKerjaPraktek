package com.dinas.dinaskesehatanbelitung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.dinas.dinaskesehatanbelitung.Api.ApiBerita;
import com.dinas.dinaskesehatanbelitung.Api.ApiCovid;
import com.dinas.dinaskesehatanbelitung.adapter.adapterBerita;
import com.dinas.dinaskesehatanbelitung.adapter.adapterBeritakesehatan;
import com.dinas.dinaskesehatanbelitung.adapter.adapterCovid;
import com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Data;
import com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example;
import com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Post;
import com.dinas.dinaskesehatanbelitung.model.covidprovensi.ListDatum;
import com.dinas.dinaskesehatanbelitung.model.model;
import com.dinas.dinaskesehatanbelitung.model.modelgambar;
import com.dinas.dinaskesehatanbelitung.model.myitem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BeritaActivity extends AppCompatActivity  {

    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;


    private Button Playmusic, Pause, Stop;
    private MediaPlayer mediaPlayer;

    RecyclerView recyclerView2,rec_beritaapi;

    RecyclerView.Adapter Adapterberita;
    RecyclerView.Adapter Adaptergambar;
    adapterBeritakesehatan adapterBeritakesehatan;
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

        //berita Api
        rec_beritaapi = findViewById(R.id.rec_beritaterkini);

        BeritaCovid();





    }

    private void BeritaCovid(){
        Call<com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example> call = ApiBerita.getDataBerita().getDataBeritaMerdeka();
        call.enqueue(new Callback<com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example>() {
            @Override
            public void onResponse(Call<com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example> call, Response<com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example> response) {
                if (response.isSuccessful()) {
                    Log.e("berhasil",response.body().toString());
//                    com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example item_berita = response.body();
//                    adapterBeritakesehatan = new adapterBeritakesehatan(item_berita,BeritaActivity.this);
//                    Log.e("berhasil",item_berita.toString());
//                    Rec_beritaApi.setAdapter(adapterBeritakesehatan);

                    com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Data item_berita = response.body().getData();
                    adapterBeritakesehatan = new adapterBeritakesehatan(item_berita, BeritaActivity.this);
                    rec_beritaapi.setAdapter(adapterBeritakesehatan);



                }
            }

            @Override
            public void onFailure(Call<com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example> call, Throwable t) {

                Log.e("gagal",t.getLocalizedMessage());
                Toast.makeText(BeritaActivity.this,"Error On"+t.toString(),Toast.LENGTH_SHORT).show();

            }
        });

    }

}






