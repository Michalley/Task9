package com.example.task9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    String url;
    Double a;
    Double b;
    Double c;
    EditText et;
    String str;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=(WebView)findViewById(R.id.wv);
        et=(EditText)findViewById(R.id.et);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.google.co.il/");
        wv.setWebViewClient(new WebViewClient());
    }

    public void go(View view) {
        i++;
        if (i==1){
            str=et.getText().toString();
            a=Double.parseDouble(str);
            et.setText("");
        }
        if (i==2){
            str=et.getText().toString();
            b=Double.parseDouble(str);
            et.setText("");
        }
        if (i==3){
            str=et.getText().toString();
            c=Double.parseDouble(str);
            et.setText("");
            url=("https://www.google.co.il/search?q="+a+"x%5E2%2B"+b+"x%2B"+c+"&oq=");
            wv.loadUrl(url);
            i=0;
        }
    }
}
