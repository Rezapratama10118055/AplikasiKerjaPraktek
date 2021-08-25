package com.dinas.dinaskesehatanbelitung.Api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCovid {
    public static Retrofit getApiCovid(){
        HttpLoggingInterceptor httpLoggingInterception = new HttpLoggingInterceptor();
        httpLoggingInterception.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterception).build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://indonesia-covid-19.mathdro.id/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        return retrofit;


    }
    public static ApiService getData(){
        ApiService apiService = getApiCovid().create(ApiService.class);
        return apiService;
    }
}

