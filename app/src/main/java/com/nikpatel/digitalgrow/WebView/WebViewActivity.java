package com.nikpatel.digitalgrow.WebView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.nikpatel.digitalgrow.R;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("www.google.ac.in");

        String web = "<html><body><h1>Hello</h1></body></html>";
        webView.loadData(web,"text/html","UTF-8");
    }
}
