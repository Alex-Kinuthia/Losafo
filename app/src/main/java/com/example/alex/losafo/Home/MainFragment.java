package com.example.alex.losafo.Home;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.alex.losafo.Found.FoundActivity;
import com.example.alex.losafo.R;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener{

    @Bind(R.id.get_started)
    CardView mGetStarted;
    @Bind(R.id.get_aid_tips)
    CardView mGetAidTips;
    @Bind(R.id.go_profile)
    CardView mEmergency;
    @Bind(R.id.emergency)
    CardView mGoProfile;

    public MainFragment() {
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
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.bind(this, view);

        mGetStarted.setOnClickListener(this);
        mGetAidTips.setOnClickListener(this);
        mGoProfile.setOnClickListener(this);
        mEmergency.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == mGetAidTips){
            Intent intent = new Intent(getActivity(), HomeActivity.class);
            startActivity(intent);

        }if (v == mGetStarted){
            Intent intent = new Intent(getActivity(), HomeActivity.class);
            startActivity(intent);
        }if (v == mGoProfile){
            Intent intent = new Intent(getActivity(), FoundActivity.class);
            startActivity(intent);
        }if (v == mEmergency){
            Fragment ProfFrag = new FragmentServe();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.mainFrame,ProfFrag);
            transaction.commit();
        }
    }
}
