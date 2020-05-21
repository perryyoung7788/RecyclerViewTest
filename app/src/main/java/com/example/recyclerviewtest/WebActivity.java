package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        Country country = intent.getParcelableExtra("countrydata");
        WebView wv = findViewById(R.id.web_view);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new myWebViewClient());
        assert country != null;
        wv.loadUrl(country.getWebsite());
        wv.requestFocus();
    }
    public static class myWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}
