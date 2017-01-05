package com.project.kzstartup.common;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.arellomobile.mvp.MvpDelegate;

/**
 * Created by onuchin on 31.12.2016.
 */

public class MvpAppCompatFragment extends Fragment{
    private MvpDelegate<? extends MvpAppCompatFragment> mMvpDelegate;

    private MvpDelegate getMvpDelegate(){
        if(mMvpDelegate==null){
            mMvpDelegate=new MvpDelegate<>(this);
        }
        return mMvpDelegate;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMvpDelegate().onCreate();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getMvpDelegate().onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        super.onStart();
        getMvpDelegate().onAttach();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(isRemoving()){
            getMvpDelegate().onDestroy();
        }
    }

}
