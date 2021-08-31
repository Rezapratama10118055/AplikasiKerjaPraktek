package com.dinas.dinaskesehatanbelitung.Api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCovidUpdate {
    public static Retrofit getApiCovidUpdate(){
        HttpLoggingInterceptor httpLoggingInterception = new HttpLoggingInterceptor();
        httpLoggingInterception.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterception).build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.covid19.go.id/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        return retrofit;


    }
    public static ApiService getDataCovid(){
        ApiService apiServicesatu = getApiCovidUpdate().create(ApiService.class);
        return apiServicesatu;
    }
}
