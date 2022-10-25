package com.app.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirToast1(View view){

        Toast.makeText(
                getApplicationContext(),
                "Ação realizada com sucesso!",
                Toast.LENGTH_SHORT
        ).show();
    }


    public void abrirToast2(View view){

        ImageView imagem = new ImageView(getApplicationContext());

        imagem.setImageResource(android.R.drawable.star_big_off);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration((toast.LENGTH_SHORT));
        toast.setView(imagem);
        toast.show();
    }

    public void abrirToast3(View view){

        TextView texto = new TextView(getApplicationContext());
        texto.setBackgroundResource(R.color.purple_200);

        texto.setText("Tarefa concluída com sucesso!");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration((toast.LENGTH_SHORT));
        toast.setView(texto);
        toast.show();
    }
}