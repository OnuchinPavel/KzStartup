package com.project.kzstartup.MainFeed;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.project.kzstartup.MainActivity;
import com.project.kzstartup.MainApplication;
import com.project.kzstartup.MoreInfo.MoreInfoFragment;
import com.project.kzstartup.R;
import com.project.kzstartup.annotation.Layout;
import com.project.kzstartup.api.OpenSpaceService;
import com.project.kzstartup.api.RetrofitClient;
import com.project.kzstartup.base.BaseFragment;
import com.project.kzstartup.base.ChangeFragmentEvent;
import com.project.kzstartup.listener.RecyclerViewListener;
import com.project.kzstartup.model.Content;
import com.project.kzstartup.model.Post;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by onuchin on 31.12.2016.
 */
@Layout(R.layout.main_fragment)
public class MainFragment extends BaseFragment {
MainPresenter mainPresenter;
    private ListView listView;
    private View parentView;

    private ArrayList<Content> contactList;
    public MainAdapter mainAdapter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
