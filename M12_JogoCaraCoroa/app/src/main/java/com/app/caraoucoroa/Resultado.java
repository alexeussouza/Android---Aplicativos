package com.app.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private ImageView btn_voltar;
    private ImageView imgResultado;
    private int numero;
    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultadoactivity);

        btn_voltar = findViewById(R.id.id_btn_voltar); // Recupera o valor do id bo Botao voltar
        imgResultado = findViewById(R.id.id_imgResultado); // Recupera o valor do id bo Botao voltar
        txtResultado = findViewById(R.id.id_txtResultado); // Recupera o valor do id do txtResultado

        Bundle dados = getIntent().getExtras(); // Recupera o valor de Intent() enviado em MainActivity
        numero = dados.getInt("numero"); // Recupera o valor enviado pela chave numero
        if(numero == 0){
            txtResultado.setText("Cara"); // Exibe o texto cara
            imgResultado.setImageResource(R.drawable.moeda_cara); // Exibe a imagem cara

        }else{
            txtResultado.setText("Coroa"); // Exibe o texto Coroa
            imgResultado.setImageResource(R.drawable.moeda_coroa); // Exibe a imagem Coroa
        }

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // finaliza a activity atual
            }
        });
    }
}