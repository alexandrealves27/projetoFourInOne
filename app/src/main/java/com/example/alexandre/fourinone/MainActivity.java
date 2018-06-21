package com.example.alexandre.fourinone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {



    // declaracao de variaveis


    private Button calculadora, localizacao, navegador, agenda, sobre;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // puxando os ids da activity

        calculadora = findViewById(R.id.calculadora);
        localizacao = findViewById(R.id.localizacao);
        navegador = findViewById(R.id.navegador);
        agenda = findViewById(R.id.agenda);
        sobre = findViewById(R.id.sobre);


        calculadora.setOnClickListener(this);
        localizacao.setOnClickListener(this);
        navegador.setOnClickListener(this);
        agenda.setOnClickListener(this);
        sobre.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.calculadora:
                Intent calc = new Intent(MainActivity.this, Calculadora.class);
                startActivity(calc);
                break;
            case R.id.localizacao:
                 Intent local = new Intent(MainActivity.this, Localizacao.class);
                 startActivity(local);
                break;
            case R.id.navegador:
                Intent nav = new Intent(MainActivity.this, Navegador.class);
                startActivity(nav);
                break;
            case R.id.agenda:
                break;
            case R.id.sobre:
                break;
        }
    }
}

