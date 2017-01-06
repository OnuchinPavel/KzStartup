package com.project.kzstartup.MainFeed;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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
    private ListView listView;
    private View parentView;

    private ArrayList<Content> contactList;
    private MainAdapter adapter;
    FragmentManager fragmentManager;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contactList = new ArrayList<>();

        parentView = view.findViewById(R.id.parentLayout);
        listView = (ListView) view.findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("TAG", "PRESS");
                Content content = adapter.getItem(position);
                fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                MoreInfoFragment categoriesFragment = MoreInfoFragment.newInstance(content);
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content, categoriesFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });




    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (true) {
            final ProgressDialog dialog;
            /**
             * Progress Dialog for User Interaction
             */
            dialog = new ProgressDialog(getActivity());
            dialog.setTitle(getString(R.string.app_name));
            dialog.setMessage(getString(R.string.app_name));
            dialog.show();

            //Creating an object of our api interface
            OpenSpaceService api = RetrofitClient.getApiService();

            /**
             * Calling JSON
             */
            Call<Post> call = api.getOpenSpacePosts();

            /**
             * Enqueue Callback will be call when get response...
             */
            call.enqueue(new Callback<Post>() {
                @Override
                public void onResponse(Call<Post> call, Response<Post> response) {
                    //Dismiss Dialog
                    dialog.dismiss();

                    if(response.isSuccessful()) {
                        /**
                         * Got Successfully
                         */
                        contactList = response.body().getContacts();

                        /**
                         * Binding that List to Adapter
                         */
                        adapter = new MainAdapter(getActivity(), contactList);
                        listView.setAdapter(adapter);

                    } else {
                    }
                }

                @Override
                public void onFailure(Call<Post> call, Throwable t) {
                    dialog.dismiss();
                }
            });

        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (true) {
            final ProgressDialog dialog;
            /**
             * Progress Dialog for User Interaction
             */
            dialog = new ProgressDialog(getActivity());
            dialog.setTitle(getString(R.string.app_name));
            dialog.setMessage(getString(R.string.app_name));
            dialog.show();

            //Creating an object of our api interface
            OpenSpaceService api = RetrofitClient.getApiService();

            /**
             * Calling JSON
             */
            Call<Post> call = api.getOpenSpacePosts();

            /**
             * Enqueue Callback will be call when get response...
             */
            call.enqueue(new Callback<Post>() {
                @Override
                public void onResponse(Call<Post> call, Response<Post> response) {
                    //Dismiss Dialog
                    dialog.dismiss();

                    if(response.isSuccessful()) {
                        /**
                         * Got Successfully
                         */
                        contactList = response.body().getContacts();

                        /**
                         * Binding that List to Adapter
                         */
                        adapter = new MainAdapter(getActivity(), contactList);
                        listView.setAdapter(adapter);

                    } else {
                    }
                }

                @Override
                public void onFailure(Call<Post> call, Throwable t) {
                    dialog.dismiss();
                }
            });

        }
    }
    }



