package com.dinas.dinaskesehatanbelitung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.dinas.dinaskesehatanbelitung.Api.ApiCovid;
import com.dinas.dinaskesehatanbelitung.Api.ApiCovidUpdate;
import com.dinas.dinaskesehatanbelitung.adapter.adapterCovid;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StrukturActivity extends AppCompatActivity {

    private RecyclerView reccovid,reccovidupdate;
    private TextView covidmeninggal, covidsembuh, coviddirawat, covidpositif, tanggalUpdate;
    RecyclerView.LayoutManager layoutManager;

    adapterCovid adapter;
    private CardView beritaklik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struktur);

        reccovid = findViewById(R.id.rec_covid);
        beritaklik = findViewById(R.id.beritani);
        coviddirawat = findViewById(R.id.covidrawat);
        covidpositif = findViewById(R.id.covidnikasuspositif);
        covidmeninggal = findViewById(R.id.covidnimeinggal);
        covidsembuh = findViewById(R.id.covidnisembuh);
        tanggalUpdate = findViewById(R.id.tanggalUpdate);
        reccovid.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        reccovid.setLayoutManager(layoutManager);

        reccovid.setLayoutManager(new LinearLayoutManager(this));
        reccovid.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        getDatacovid();
        getDataCovidUpdate();


        beritaklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StrukturActivity.this,BeritaActivity.class);
                startActivity(i);
            }
        });


    }

    private void getDatacovid() {

        Call<com.dinas.dinaskesehatanbelitung.model.covidprovensi.Example> call = ApiCovid.getData().getDataCovid();
        call.enqueue(new Callback<com.dinas.dinaskesehatanbelitung.model.covidprovensi.Example>() {
            @Override
            public void onResponse(Call<com.dinas.dinaskesehatanbelitung.model.covidprovensi.Example> call, Response<com.dinas.dinaskesehatanbelitung.model.covidprovensi.Example> response) {
                if (response.isSuccessful()) {
                    Log.e("berhasil", response.body().toString());
                    List<com.dinas.dinaskesehatanbelitung.model.covidprovensi.ListDatum> example = response.body().getListData();
                    adapter = new adapterCovid(example);
                    reccovid.setAdapter(adapter);


                }
            }

            @Override
            public void onFailure(Call<com.dinas.dinaskesehatanbelitung.model.covidprovensi.Example> call, Throwable t) {
                Log.e("gagal", t.getLocalizedMessage());

            }
        });

    }

    private void getDataCovidUpdate() {
        Call<com.dinas.dinaskesehatanbelitung.model.covidupdate.Example> call = ApiCovidUpdate.getDataCovid().getDataCovidUpdate();
        call.enqueue(new Callback<com.dinas.dinaskesehatanbelitung.model.covidupdate.Example>() {
            @Override
            public void onResponse(Call<com.dinas.dinaskesehatanbelitung.model.covidupdate.Example> call, Response<com.dinas.dinaskesehatanbelitung.model.covidupdate.Example> response) {
                if (response.isSuccessful()) {
                    Log.e("berhasil", response.body().toString());

//                    adapterCovidUpdate = new adapterCovidUpdate(example);
//                    reccovid.setAdapter(adapter);

                    coviddirawat.setText(response.body().getUpdate().getTotal().getJumlahDirawat().toString());
                    covidmeninggal.setText(response.body().getUpdate().getTotal().getJumlahMeninggal().toString());
                    covidpositif.setText(response.body().getUpdate().getTotal().getJumlahPositif().toString());
                    covidsembuh.setText(response.body().getUpdate().getTotal().getJumlahSembuh().toString());
                    tanggalUpdate.setText(response.body().getUpdate().getPenambahan().getCreated());



                }
            }

            @Override
            public void onFailure(Call<com.dinas.dinaskesehatanbelitung.model.covidupdate.Example> call, Throwable t) {
                Log.e("gagal", t.getLocalizedMessage());


            }
        });

    }

}


