package com.app.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn_jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jogar = findViewById(R.id.id_btnJogar); //Recupera o id do botao jogar

        btn_jogar.setOnClickListener(new View.OnClickListener() { // Responde ao evento de click do botao jogar
            @Override
            public void onClick(View view) {

                int numero = new Random().nextInt(2); // Retorna numero randomico
                Intent intent = new Intent(getApplicationContext(), Resultado.class); // Define activity para Onclick
                intent.putExtra("numero", numero); //Passa valor entre activity
                startActivity(intent);
            }
        });
    }
}