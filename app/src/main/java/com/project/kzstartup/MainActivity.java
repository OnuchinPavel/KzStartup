package com.project.kzstartup;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.project.kzstartup.MainFeed.MainAdapter;
import com.project.kzstartup.MainFeed.MainFragment;
import com.project.kzstartup.api.OpenSpaceService;
import com.project.kzstartup.api.RetrofitClient;
import com.project.kzstartup.common.MvpAppCompatActivity;
import com.project.kzstartup.model.Content;
import com.project.kzstartup.model.Post;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends MvpAppCompatActivity {
    private ListView listView;
    private View parentView;

    private ArrayList<Content> contactList;
    private MainAdapter adapter;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        contactList = new ArrayList<>();

        parentView = findViewById(R.id.parentLayout);
        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
        Toast toast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull final View view) {

                /**
                 * Checking Internet Connection
                 */
                if (true) {
                    final ProgressDialog dialog;
                    /**
                     * Progress Dialog for User Interaction
                     */
                    dialog = new ProgressDialog(MainActivity.this);
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
                                adapter = new MainAdapter(MainActivity.this, contactList);
                                listView.setAdapter(adapter);

                            } else {
                            }
                        }

                        @Override
                        public void onFailure(Call<Post> call, Throwable t) {
                            dialog.dismiss();
                        }
                    });

                } else {
                }
            }
        });
    }



    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }
}
