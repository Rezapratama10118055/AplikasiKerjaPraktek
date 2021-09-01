package com.dinas.dinaskesehatanbelitung.Api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("public/api/prov.json")
    Call<com.dinas.dinaskesehatanbelitung.model.covidprovensi.Example> getDataCovid();

    @GET("public/api/update.json")
    Call<com.dinas.dinaskesehatanbelitung.model.covidupdate.Example>getDataCovidUpdate();

    @GET("merdeka/sehat/")
    Call<com.dinas.dinaskesehatanbelitung.model.BeritaMerdeka.Example>getDataBeritaMerdeka();
}
