package com.project.kzstartup.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.kzstartup.annotation.Layout;
import com.project.kzstartup.common.MvpAppCompatFragment;

import java.lang.annotation.Annotation;

import butterknife.ButterKnife;

/**
 * Created by onuchin on 31.12.2016.
 */

public class BaseFragment extends MvpAppCompatFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResId(),container,false);
        ButterKnife.bind(this,view);
        return  view;
    }

    private  int getLayoutResId(){
        Annotation  annotation =this.getClass().getAnnotation(Layout.class);
        if(annotation!=null){
            return ((Layout) annotation).value();

        }
        else {
            throw  new IllegalStateException("You must provide a layout via the @Layout annotation");
        }
    }
}
