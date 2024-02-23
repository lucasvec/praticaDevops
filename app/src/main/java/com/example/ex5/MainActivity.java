package com.example.ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atributos dos elementos que vamos manipular
    TextView inputGasolina;
    TextView inputAlcool;
    TextView textResposta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buscando os elementos pelo seu ID e definindo como o valor dos atributos
        inputAlcool = findViewById(R.id.inputAlcool);
        inputGasolina = findViewById(R.id.inputGasolina);
        textResposta = findViewById(R.id.textResposta);
    }

    //Método para calcular qual preço está mais viável
    public void calcularPreco(View view){

        //Criando variáveis com os respectivos tipos primitivos, para que possamos fazer a manipulação
        double precoGasolina = Double.parseDouble(inputGasolina.getText().toString());
        double precoAlcool = Double.parseDouble(inputAlcool.getText().toString());

        //Fórmula para ter o valor de comparação com o índice
        double calculo = precoAlcool / precoGasolina;
        //Índice
        double indice = 0.7;

        //Se o valor da divisão for maior igual ao indice, gasolina compensa mais, senão o álcool
        if(calculo >= indice){
            textResposta.setText("Gasolina compensa mais.");
        }else{
            textResposta.setText("Álcool compensa mais.");
        }


    }

}