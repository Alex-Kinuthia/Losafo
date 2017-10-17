package com.example.alex.losafo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;



public class DisplayFragment extends Fragment implements View.OnClickListener{

    @Bind(R.id.get_started) CardView mGetStarted;
    @Bind(R.id.get_aid_tips) CardView mGetAidTips;
    @Bind(R.id.go_profile) CardView mGoProfile;
    @Bind(R.id.found) CardView mFound;

    public DisplayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_display, container, false);

        ButterKnife.bind(this, view);

        mGetStarted.setOnClickListener(this);
        mGetAidTips.setOnClickListener(this);
        mGoProfile.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == mGetAidTips) {
            Intent intent = new Intent(getActivity(), ItemCodeActivity.class);
            startActivity(intent);
        }if (v == mGetStarted){
            Intent intent = new Intent(getActivity(), FindActivity.class);
            startActivity(intent);
        }if (v == mGoProfile){
            Intent intent = new Intent(getActivity(), EmergencyActivity.class);
            startActivity(intent);
        }if (v == mGoProfile){
            Intent intent = new Intent(getActivity(), RetrieveFoundItemActivity.class);
            startActivity(intent);
        }

    }
}