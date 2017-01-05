package com.project.kzstartup.MoreInfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.kzstartup.R;
import com.project.kzstartup.annotation.Layout;
import com.project.kzstartup.base.BaseFragment;
import com.project.kzstartup.common.MvpAppCompatFragment;

/**
 * Created by onuchin on 31.12.2016.
 */
@Layout(R.layout.more_info_fragment)
public class MoreInfoFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
