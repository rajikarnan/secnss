package com.example.admin.sec_nss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main42Activity extends AppCompatActivity {
    public class WebViewController extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main42);
        webview = (WebView)findViewById(R.id.webview1);
        webview.setWebViewClient(new WebViewController());
        openURL();
    }
private void openURL(){
        webview.loadUrl("http://nss.saveetha.in/newsfeed/");
        webview.requestFocus();
}



}
