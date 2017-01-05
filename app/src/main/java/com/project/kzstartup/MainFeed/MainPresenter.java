package com.project.kzstartup.MainFeed;

import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.MvpView;
import com.project.kzstartup.MainApplication;
import com.project.kzstartup.api.OpenSpaceService;
import com.project.kzstartup.model.Content;
import com.project.kzstartup.model.Post;

import java.util.List;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/**
 * Created by onuchin on 31.12.2016.
 */
@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {
 private Subscription subscription;
    Context context;

    public void loadPost(){

    }


}
