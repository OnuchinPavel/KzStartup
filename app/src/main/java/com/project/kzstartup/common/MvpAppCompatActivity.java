package com.project.kzstartup.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.arellomobile.mvp.MvpDelegate;

/**
 * Created by onuchin on 31.12.2016.
 */

public class MvpAppCompatActivity extends AppCompatActivity {
    private MvpDelegate<?extends  MvpAppCompatActivity> mMvpDelegate;

    private  MvpDelegate getMvpDelegate(){
        if(mMvpDelegate==null){
            mMvpDelegate= new MvpDelegate<>(this);
        }
        return mMvpDelegate;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMvpDelegate().onCreate();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getMvpDelegate().onDetach();
        if(isFinishing()){
            getMvpDelegate().onDestroy();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getMvpDelegate().onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        getMvpDelegate().onAttach();
    }
}
