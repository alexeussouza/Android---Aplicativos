package com.app.enviandodadosnaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView nome;
    private  TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        nome = findViewById(R.id.id_NomeSegunda);
        email = findViewById(R.id.id_txtEmailSegunda);
        //Recuperar os dados de outra activity

        Bundle dados = getIntent().getExtras();
        String txtNome = dados.getString("nome");
        String txtEmail = dados.getString("email");

        nome.setText(txtNome);
        email.setText(txtEmail);

    }
}