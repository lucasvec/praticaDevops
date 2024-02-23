package com.example.ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputGasolina;
    TextView inputAlcool;
    TextView textResposta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputAlcool = findViewById(R.id.inputAlcool);
        inputGasolina = findViewById(R.id.inputGasolina);
        textResposta = findViewById(R.id.textResposta);
    }

    public void calcularPreco(View view){

        double precoGasolina = Double.parseDouble(inputGasolina.getText().toString());
        double precoAlcool = Double.parseDouble(inputAlcool.getText().toString());
        double calculo = precoAlcool / precoGasolina;
        double indice = 0.7;

        if(calculo >= indice){
            textResposta.setText("Gasolina compensa mais.");
        }else{
            textResposta.setText("Álcool compensa mais.");
        }


    }

}