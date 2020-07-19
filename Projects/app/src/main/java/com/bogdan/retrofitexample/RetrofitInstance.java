package com.bogdan.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://www.googleapis.com/books/v1/volumes?langRestrict=en&maxResults=40&printType=books&key=AIzaSyBaDCRK59AGwh2uFuHLbfzE4kjeCbZjtT4&q=";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
