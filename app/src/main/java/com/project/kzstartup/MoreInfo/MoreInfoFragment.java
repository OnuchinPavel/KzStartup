package com.project.kzstartup.MoreInfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.kzstartup.R;
import com.project.kzstartup.annotation.Layout;
import com.project.kzstartup.base.BaseFragment;
import com.project.kzstartup.common.MvpAppCompatFragment;
import com.project.kzstartup.model.Content;
import com.squareup.picasso.Picasso;

/**
 * Created by onuchin on 31.12.2016.
 */
@Layout(R.layout.more_info_fragment)
public class MoreInfoFragment extends BaseFragment {
    public static String MOTIVIVATION_INFO = "trip info";
    private  Content post;
    public static MoreInfoFragment newInstance(Content post) {
        MoreInfoFragment extendedInfoFragment = new MoreInfoFragment();
        Bundle args = new Bundle();
        args.putSerializable(MOTIVIVATION_INFO, post);
        extendedInfoFragment.setArguments(args);
        return extendedInfoFragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        post = (Content) getArguments().getSerializable(MOTIVIVATION_INFO);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView bigtext = (TextView)view.findViewById(R.id.textView_bigtext);
        bigtext.setText(post.getText());
        TextView datetext= (TextView)view.findViewById(R.id.textView_date);
        datetext.setText(post.getDate());
        ImageView image = (ImageView)view.findViewById(R.id.imageView_big_picture);
        Picasso.with(getActivity()).load(post.getImg()).into(image);
    }
}
