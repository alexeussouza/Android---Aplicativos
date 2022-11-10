package com.app.planosaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnCredenciados;
    private ImageButton btnCarteirinha;
    private ImageButton btnCadastro;
    private ImageButton btnRevistasManuais;
    private ImageButton btnNoticias;
    private ImageButton btnContatos;
    private ImageButton btnAlarmes;
    private ImageButton btnPrescricoes;
    private ImageButton btnTelemedicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlarmes = findViewById(R.id.id_btnAlarmes);
        btnCadastro = findViewById(R.id.id_btnAtualizacaoCadastral);
        btnCarteirinha = findViewById(R.id.id_btnCarteirinha);
        btnContatos = findViewById(R.id.id_btnContatos);
        btnCredenciados = findViewById(R.id.id_btnCredenciados);
        btnNoticias = findViewById(R.id.id_btnNoticias);
        btnPrescricoes = findViewById(R.id.id_btnPrescricoes);
        btnRevistasManuais = findViewById(R.id.id_btnRevistasManuais);
        btnTelemedicina = findViewById(R.id.id_btnTelemedicina);

        btnAlarmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _Alarmes.class);
                startActivity(intent);
            }
        });

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _AtualizacaoCadastral.class);
                startActivity(intent);
            }
        });

        btnCarteirinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _Carteirinha.class);
                startActivity(intent);
            }
        });

        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _Contatos.class);
                startActivity(intent);
            }
        });

        btnCredenciados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _Credenciados.class);
                startActivity(intent);
            }
        });

        btnRevistasManuais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ManuaisRevistas.class);
                startActivity(intent);
            }
        });

        btnNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _Noticias.class);
                startActivity(intent);
            }
        });

        btnPrescricoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _Prescricoes.class);
                startActivity(intent);
            }
        });

        btnTelemedicina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _Telemedicina.class);
                startActivity(intent);
            }
        });
    }
}