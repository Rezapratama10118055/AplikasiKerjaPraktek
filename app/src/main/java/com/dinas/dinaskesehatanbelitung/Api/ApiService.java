package com.dinas.dinaskesehatanbelitung.Api;

import com.dinas.dinaskesehatanbelitung.model.Example;
import com.dinas.dinaskesehatanbelitung.model.covidupdate.Total;
import com.dinas.dinaskesehatanbelitung.model.covidupdate.Update;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/provinsi/")
    Call<Example> getDataCovid();

    @GET("public/api/update.json")
    Call<com.dinas.dinaskesehatanbelitung.model.covidupdate.Example>getDataCovidUpdate();
}
