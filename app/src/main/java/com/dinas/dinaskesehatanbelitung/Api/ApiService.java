package com.dinas.dinaskesehatanbelitung.Api;

import com.dinas.dinaskesehatanbelitung.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/provinsi/")
    Call<Example> getDataCovid();
}
