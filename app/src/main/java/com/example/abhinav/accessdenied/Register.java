package com.example.abhinav.accessdenied;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Register extends AppCompatActivity {

    private WebView webView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_register);

        progressBar = findViewById(R.id.progressView);
        webView = findViewById(R.id.web);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        actionBar.setTitle("Register");


        getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

        webView = (WebView) findViewById(R.id.web);
        webView.setWebViewClient(new HelloWebViewClient(progressBar));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://ietevit.com/accessdenied");
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

    public boolean onSupportNavigateUp() {
        finish();

        return true;
    }

    private class HelloWebViewClient extends WebViewClient {
        private ProgressBar progressBar;

        public HelloWebViewClient (ProgressBar progressBar){
            this.progressBar=progressBar;
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }
    }

}
