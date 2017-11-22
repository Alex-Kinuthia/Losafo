package com.example.alex.losafo.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.alex.losafo.Found.FoundActivity;
import com.example.alex.losafo.Home.HomeActivity;
import com.example.alex.losafo.Profile.ProfileActivity;
import com.example.alex.losafo.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;


/**
 * Created by miller on 6/18/17.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: setting up bottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
    }

    public  static void enableNavigation(final Context context,BottomNavigationViewEx view){

        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.tab_home:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        context.startActivity(intent1);
                        break;
                    case R.id.tab_found:
                        Intent intent2 = new Intent(context, FoundActivity.class);
                        intent2.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        context.startActivity(intent2);
                        break;
                    case R.id.tab_profile:
                        Intent intent3 = new Intent(context, ProfileActivity.class);
                        intent3.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        context.startActivity(intent3);
                        break;
                }
                return false;
            }
        });
    }
}
