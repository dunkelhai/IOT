package com.unoesc.iot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings; import android.webkit.WebView; import android.webkit.WebViewClient; import android.widget.TextView;
public class MainActivity extends AppCompatActivity { WebView myWebView;
    TextView servidor;
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        myWebView = (WebView) findViewById(R.id.wvApp); WebViewClient mWebViewClient = new WebViewClient();
        myWebView.setWebViewClient(mWebViewClient); WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true); servidor = findViewById(R.id.edtServidor);
        conectar();
    }
    public void btnConectar(View view) { conectar();
    }
    public void btnLigar(View view) { myWebView.loadUrl(servidor.getText().toString() + "/ledon");
    }
    public void btnDesligar(View view) { myWebView.loadUrl(servidor.getText().toString() + "/ledoff");
    }
    private void conectar() { myWebView.loadUrl(servidor.getText().toString());
    } }