package com.example.ctracker1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apiinterface {
    String Base_url="https://disease.sh/v3/covid-19/";
    @GET("countries")
    Call<List<ModelClass>>getcountrydata();
}
