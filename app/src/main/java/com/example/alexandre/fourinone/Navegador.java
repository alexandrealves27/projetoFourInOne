package com.example.alexandre.fourinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Navegador extends AppCompatActivity {

    private Button entrar;
    private EditText url;
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

        entrar = (Button) findViewById(R.id.entrar) ;
        url = (EditText) findViewById(R.id.url);
        webview = (WebView) findViewById(R.id.webview);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Navegador.this, "Navegando...", Toast.LENGTH_SHORT).show();
                webview.loadUrl(url.getText().toString());
            }
        });
    }
}
