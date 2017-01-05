package com.project.kzstartup;

import android.app.Application;
import android.content.Context;

import com.project.kzstartup.api.OpenSpaceService;
import com.project.kzstartup.model.Content;
import com.squareup.otto.Bus;

import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by onuchin on 31.12.2016.
 */

public class MainApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

    }

    public  static  MainApplication get(Context context){
        return (MainApplication)context.getApplicationContext();
    }



}
