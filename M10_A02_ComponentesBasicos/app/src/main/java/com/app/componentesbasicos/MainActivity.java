package com.app.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    TextInputEditText email;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.id_txt_Nome);
        email = findViewById(R.id.id_txt_email);
        resultado = findViewById(R.id.id_txt_Resultado);
    }

    public void exibirDados(View view){

        resultado.setText("Nome: " + nome.getText().toString() + "\nEmail: " + email.getText().toString());
    }

    public void limparDados(View view){

        resultado.setText("Resultado:");
        nome.setText("");
        email.setText("");
    }
}