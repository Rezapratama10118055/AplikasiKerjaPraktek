package com.dinas.dinaskesehatanbelitung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dinas.dinaskesehatanbelitung.adapter.adapterGambar;
import com.dinas.dinaskesehatanbelitung.adapter.adapterKamenkes;
import com.dinas.dinaskesehatanbelitung.adapter.adapterPelayanan;
import com.dinas.dinaskesehatanbelitung.model.model;
import com.dinas.dinaskesehatanbelitung.model.modelgaleri;
import com.dinas.dinaskesehatanbelitung.model.modelgambar;
import com.dinas.dinaskesehatanbelitung.model.mydatagaleri;
import com.dinas.dinaskesehatanbelitung.model.mydatagambar;

import java.util.ArrayList;



public class GaleriActivity extends AppCompatActivity {

    RecyclerView Rec_galery,rec_kamenkes,rec_sarana;


    RecyclerView.Adapter Adaptergaleri;
    RecyclerView.LayoutManager layoutManager;
    private  ArrayList<modelgaleri>datagambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);


        //galeri
        Rec_galery = findViewById(R.id.rec_pelayanan);
        Rec_galery.setHasFixedSize(true);
        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(GaleriActivity.this, LinearLayoutManager.HORIZONTAL, false);
        Rec_galery.setLayoutManager(horizontalLayoutManagaer);
        Rec_galery.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        datagambar = new ArrayList<>();
        for (int i = 0; i < mydatagaleri.img_puskes.length; i++){
            datagambar.add(new modelgaleri(mydatagaleri.img_puskes[i]));
        }
        Adaptergaleri = new adapterPelayanan(datagambar,this);
        Rec_galery.setAdapter(Adaptergaleri);


        //kamenkes
        rec_kamenkes = findViewById(R.id.rec_kunjungan);
        rec_kamenkes.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rec_kamenkes.setLayoutManager(layoutManager);
        LinearLayoutManager wlayoutManager = new LinearLayoutManager(GaleriActivity.this, LinearLayoutManager.HORIZONTAL, false);
        rec_kamenkes.setLayoutManager(wlayoutManager);
        rec_kamenkes.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        datagambar = new ArrayList<>();
        for (int i = 0; i < mydatagaleri.img_kamenkes.length; i++){
            datagambar.add(new modelgaleri(mydatagaleri.img_kamenkes[i]));
        }
        Adaptergaleri = new adapterKamenkes(datagambar,this);
        rec_kamenkes.setAdapter(Adaptergaleri);

        //sarana
        rec_sarana = findViewById(R.id.rec_sarana);
        rec_sarana.setHasFixedSize(true);
        LinearLayoutManager ylayoutManager = new LinearLayoutManager(GaleriActivity.this, LinearLayoutManager.HORIZONTAL, false);
        rec_sarana.setLayoutManager(ylayoutManager);
        rec_sarana.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        datagambar = new ArrayList<>();
        for (int i = 0; i < mydatagaleri.img_sarana.length; i++){
            datagambar.add(new modelgaleri(mydatagaleri.img_sarana[i]));
        }
        Adaptergaleri = new adapterKamenkes(datagambar,this);
        rec_sarana.setAdapter(Adaptergaleri);

    }
}