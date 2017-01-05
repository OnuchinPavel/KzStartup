package com.project.kzstartup.api;

import com.project.kzstartup.model.Post;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by onuchin on 31.12.2016.
 */

public interface OpenSpaceService {


    @GET("/api/v1/news/get")
    Call<Post> getOpenSpacePosts();


}
