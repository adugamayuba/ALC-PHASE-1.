package com.example.alcphase1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.http.SslError;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class About_ALC extends AppCompatActivity {


  private   WebView mWebView;
  ImageView mback_about;



    Activity activity ;
    private ProgressDialog progDailog;
    private Context context;

    private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__alc);
        mywebview = (WebView) findViewById(R.id.web_view);
        mywebview.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        mywebview.loadUrl("http://www.andela.com/alc");

        WebSettings webber = mywebview.getSettings();
        webber.setJavaScriptEnabled(true);


        mback_about = findViewById(R.id.back_about);

        mback_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mback_about = new Intent();
                mback_about.setClass(About_ALC.this, MainActivity.class);
                startActivity(mback_about);
                finish();

            }
        });

    }

    }

