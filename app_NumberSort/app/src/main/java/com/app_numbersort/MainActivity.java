package com.app_numbersort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){

        TextView Nome = findViewById(R.id.txtNome);
        TextView Multiline = findViewById(R.id.txtMultiLine);
        TextView numeroSorteado = findViewById(R.id.txtValorSorteado);
        Multiline.setText(Nome.getText());
        int x = new Random().nextInt(10); // Gera numeros aleatorios de 0 ate 9
       numeroSorteado.setText("" + x);
    }

    public void limparTexto(View view){

        TextView txtNome = findViewById(R.id.txtNome);
        TextView Multiline = findViewById(R.id.txtMultiLine);
        TextView numeroSorteado = findViewById(R.id.txtValorSorteado);

        Multiline.setText("");
        txtNome.setText("");
        numeroSorteado.setText("");
    }
}