package com.example.alexandre.fourinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    private EditText num1, num2, resultado;
    private Button somar, subtrair, dividir, multiplicar, porcentagem, voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        resultado = (EditText) findViewById(R.id.resultado);

        somar = (Button) findViewById(R.id.somar);
        subtrair = (Button) findViewById(R.id.subtrair);
        dividir = (Button) findViewById(R.id.dividir);
        multiplicar = (Button) findViewById(R.id.multiplicar);
        porcentagem = (Button) findViewById(R.id.porcentagem);
        voltar = (Button) findViewById(R.id.voltar);

        somar.setOnClickListener(this);
        subtrair.setOnClickListener(this);
        dividir.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        porcentagem.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int inteiro1 = Integer.parseInt(n1);
        int inteiro2 = Integer.parseInt(n2);
        int res = 0;

        switch (v.getId()){
            case R.id.somar:
                res = inteiro1 + inteiro2;
                break;
            case R.id.subtrair:
                res = inteiro1 - inteiro2;
                break;
            case R.id.dividir:
                res = inteiro1 / inteiro2;
                break;
            case R.id.multiplicar:
                res = inteiro1 * inteiro2;
                break;
            case R.id.porcentagem:
                res = (inteiro1 * inteiro2) /100;
                break;
        }

        resultado.setText(""+res);

        voltar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent menu = new Intent (Calculadora.this, MainActivity.class);
                startActivity(menu);
            }
        });
    }


}