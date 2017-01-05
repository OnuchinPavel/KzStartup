package com.project.kzstartup.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by onuchin on 05.01.2017.
 */

public class RetrofitClient {
    ///api/v1/news/get

    private static final String ROOT_URL = "http://adcloud.openspace.kz";

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public  static  OpenSpaceService getApiService(){
        return getRetrofitInstance().create(OpenSpaceService.class);
    }

}
