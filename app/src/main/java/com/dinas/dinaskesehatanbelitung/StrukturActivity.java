package com.dinas.dinaskesehatanbelitung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.dinas.dinaskesehatanbelitung.Api.ApiCovid;
import com.dinas.dinaskesehatanbelitung.adapter.adapterCovid;
import com.dinas.dinaskesehatanbelitung.model.Datum;
import com.dinas.dinaskesehatanbelitung.model.Example;
import com.dinas.dinaskesehatanbelitung.model.model;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StrukturActivity extends AppCompatActivity {

    private RecyclerView reccovid;
    private TextView tx_meninggal, tx_sembuh, tx_provensi, tx_positif;
    RecyclerView.LayoutManager layoutManager;
    private List<Datum> dataItem;
    adapterCovid adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struktur);

        reccovid = findViewById(R.id.rec_covid);
        reccovid.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        reccovid.setLayoutManager(layoutManager);

        reccovid.setLayoutManager(new LinearLayoutManager(this));
        reccovid.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        getDatacovid();




    }
    private void getDatacovid() {

        Call<Example> call = ApiCovid.getData().getDataCovid();
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if(response.isSuccessful()){
                    Log.e("berhasil",response.body().toString());
                    List<Datum> example = response.body().getData();
                    adapter = new adapterCovid(example);
                    reccovid.setAdapter(adapter);


                }
            }

            @Override
            public void onFailure(Call <Example> call, Throwable t) {
                Log.e("gagal",t.getLocalizedMessage());

            }
        });

    }

    }

