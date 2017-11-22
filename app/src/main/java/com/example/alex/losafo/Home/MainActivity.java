package com.example.alex.losafo.Home;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.alex.losafo.LoginActivity;
import com.example.alex.losafo.R;
import com.example.alex.losafo.RegisterActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtli, txttv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        txtli = (TextView) findViewById(R.id.txtli);
        txttv = (TextView) findViewById(R.id.txttv);




        txtli.setOnClickListener(this);
        txttv.setOnClickListener(this);;
    }

    @Override
    public void onClick(View v) {
        if (v == txtli){
            Intent i = new Intent(this, RegisterActivity.class);
            startActivity(i);
        }
        else if (v == txttv){
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        }
        }
}

