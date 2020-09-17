package com.example.ipl2020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {
    private Button btnStream,btnUser,btnIdc;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btnStream= (Button) findViewById(R.id.btnStream);
        btnIdc= (Button) findViewById(R.id.btnIdc);
        btnUser= (Button) findViewById(R.id.btnUser);
        btnStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStreamActivity();
            }
        });

        btnIdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIdcActivity();
            }
        });

        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserActivity();
            }
        });
    }
    public void openStreamActivity(){
        Intent intent = new Intent(this, StreamActivity.class);
        startActivity(intent);
    }

    public void openIdcActivity(){
        Intent intent1 = new Intent(this, IdcActivity.class);
        startActivity(intent1);
    }

    public void openUserActivity() {
        Intent intent2 = new Intent(this, UserActivity.class);
        startActivity(intent2);
    }


}