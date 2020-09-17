package com.example.ipl2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class StreamActivity extends AppCompatActivity {
    private WebView myWebViev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);

        myWebViev = (WebView) findViewById(R.id.myWebView);
        WebSettings webSettings = myWebViev.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebViev.loadUrl("https://web.flixplay.in.net");
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