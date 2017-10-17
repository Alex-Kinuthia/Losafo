package com.example.alex.losafo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;

public class DisplayActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
// bar.setBackgroundDrawable(new ColorDrawable(""));
        // ColorDrawable colorDrawable = new ColorDrawable(Color.rgb(179,0,0));
        //   bar.setBackgroundDrawable(colorDrawable);

//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//                Intent in = new Intent(MainActivity.this,ShowLocation.class);
//                startActivity(in);
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


        //To send alert msg
   /* public void Msg(View view) {
        Log.i("Send SMS", "");
        String phoneNo = txtphoneNo.getText().toString();
        SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        String alert = (sharedpreferences.getString("Alertmsg", null));
        try{
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, alert, null, null);
            Toast.makeText(getApplicationContext(), "Alert SMS sent.", Toast.LENGTH_LONG).show();
        }
        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS failed, please try again.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }*/
        @Override
        public void onBackPressed () {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent settings = new Intent(android.provider.Settings.ACTION_SETTINGS);
            startActivity(settings);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected (MenuItem item){
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent myIntent = new Intent(DisplayActivity.this, DisplayActivity.class);
            DisplayActivity.this.startActivity(myIntent);

        } else if (id == R.id.nav_location) {
            Intent myIntent = new Intent(DisplayActivity.this, DisplayActivity.class);
            DisplayActivity.this.startActivity(myIntent);


        } else if (id == R.id.nav_settings) {
            Intent myIntent = new Intent(DisplayActivity.this, DisplayActivity.class);
            DisplayActivity.this.startActivity(myIntent);


        } else if (id == R.id.nav_send) {
            Intent myIntent = new Intent(DisplayActivity.this, DisplayActivity.class);
            DisplayActivity.this.startActivity(myIntent);

        } else if (id == R.id.nav_logout) {
            logout();
            return true;
        } else if (id == R.id.nav_logout) {
            Intent myIntent = new Intent(DisplayActivity.this, LoginActivity.class);
            DisplayActivity.this.startActivity(myIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void logout() {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(DisplayActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}