package com.example.ctracker1;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiutilities {
    public static Apiinterface getAPIInterface()
    {
        Retrofit retrofit = null;
        if(retrofit==null)
       {
           retrofit=new Retrofit.Builder().baseUrl(Apiinterface.Base_url).addConverterFactory(GsonConverterFactory.create()).build();

       }
      return retrofit.create(Apiinterface.class);
    }
}
