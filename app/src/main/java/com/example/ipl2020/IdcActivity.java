package com.example.ipl2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IdcActivity extends AppCompatActivity {
    private WebView myWebViev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idc);

        myWebViev = (WebView) findViewById(R.id.myIdcView);
        WebSettings webSettings = myWebViev.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebViev.loadUrl("https://www.indiandevelopersclub.com");
        myWebViev.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (myWebViev.canGoBack()){
            myWebViev.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}