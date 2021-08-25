package com.dinas.dinaskesehatanbelitung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dinas.dinaskesehatanbelitung.adapter.SliderPagerAdapter;
import com.dinas.dinaskesehatanbelitung.adapter.adapterBerita;
import com.dinas.dinaskesehatanbelitung.adapter.adapterGambar;
import com.dinas.dinaskesehatanbelitung.decoration.BannerSlider;
import com.dinas.dinaskesehatanbelitung.decoration.SliderIndicator;
import com.dinas.dinaskesehatanbelitung.fragment.FragmentSlider;
import com.dinas.dinaskesehatanbelitung.model.model;
import com.dinas.dinaskesehatanbelitung.model.modelgambar;
import com.dinas.dinaskesehatanbelitung.model.mydatagambar;
import com.dinas.dinaskesehatanbelitung.model.myitem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;


    private BannerSlider bannerSlider;
    private LinearLayout mLinearLayout;

    RecyclerView recyclerView1,Rec_gambar;

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
        setContentView(R.layout.activity_main);
        bannerSlider = findViewById(R.id.sliderView);
        mLinearLayout = findViewById(R.id.pagesContainer);
        setupSlider();

        //Berita
        recyclerView1 = findViewById(R.id.rec_berita);
        recyclerView1.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(layoutManager);
        recyclerView1.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        dataItem = new ArrayList<>();
        for(int i = 0; i < myitem.nama.length; i++ ){
            dataItem.add(new model(myitem.images[i] ,myitem.nama[i] ,myitem.penjelasan[i],myitem.PenjelasanLengkap[i],myitem.akun[i],myitem.tanggal[i],myitem.katagori[i]));
        }
        Adapterberita = new adapterBerita(dataItem, this);
        recyclerView1.setAdapter(Adapterberita);

        //gambar
        Rec_gambar = findViewById(R.id.rac_gambar);
        Rec_gambar.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        Rec_gambar.setLayoutManager(layoutManager);
        Rec_gambar.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        datagambar = new ArrayList<>();
        for (int i = 0; i < mydatagambar.img_galeri.length; i++){
            datagambar.add(new modelgambar(mydatagambar.img_galeri[i]));
        }
        Adaptergambar = new adapterGambar(datagambar,this);
        Rec_gambar.setAdapter(Adaptergambar);


        btn_berita = findViewById(R.id.btn_berita);
        btn_galeri = findViewById(R.id.btn_galeri);
        btn_struktur = findViewById(R.id.btn_struktur);
        btn_tentang = findViewById(R.id.btn_tentang);

        //btn katagori
        btn_berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,BeritaActivity.class);
                startActivity(i);

            }
        });
        btn_galeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,GaleriActivity.class);
                startActivity(i);

            }
        });
        btn_struktur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,StrukturActivity.class);
                startActivity(i);

            }
        });
        btn_tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,TentangActivity.class);
                startActivity(i);
            }
        });



    }

    private void setupSlider() {
        bannerSlider.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();

        //link image
        fragments.add(FragmentSlider.newInstance("https://lh3.googleusercontent.com/bE9vyWuDdpDEsXo5NPJ8VUx1TfWk63xym9z6t7A3M4mhRinHJNOYWHilqVYVFDwbCUnhwm4=s200"));
        fragments.add(FragmentSlider.newInstance("https://lh3.googleusercontent.com/My_bdVUlNPqumUswol9iUA1q7GfbG427Qi13l3HcdqO26ef8hf0iJ9_9q0zMUEAHV93thwc=s500"));
        fragments.add(FragmentSlider.newInstance("https://lh3.googleusercontent.com/l_Iq2_osF5rmvXQm5M9mUq9OJ-Juhi67fanqZ7qOOpqgGP_zuyE9ucdrlRknGoLnOiFBpw=s200"));
        fragments.add(FragmentSlider.newInstance("https://lh3.googleusercontent.com/QtiALBhdz7Ro9My88tfeerNKB1d7ZByH0e-LswwqtW5iLnZ7-1v2nL0EogkGldTGc4XvmA=s200"));


        mAdapter = new SliderPagerAdapter(getSupportFragmentManager(), fragments);
        bannerSlider.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(this, mLinearLayout, bannerSlider, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();


    }
}