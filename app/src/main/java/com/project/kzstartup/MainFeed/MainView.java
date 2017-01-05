package com.project.kzstartup.MainFeed;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.project.kzstartup.model.Content;
import com.project.kzstartup.model.Post;

import java.util.List;

/**
 * Created by onuchin on 31.12.2016.
 */
@StateStrategyType(AddToEndSingleStrategy.class)
public interface MainView extends MvpView{
 void showError(String message);
    void hideError();
    void onStartLoading();
    void onFinishLoading();
    void postsok(Post posts);
}
