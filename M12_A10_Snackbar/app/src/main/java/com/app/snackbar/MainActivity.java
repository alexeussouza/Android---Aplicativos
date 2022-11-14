package com.app.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrirListener;
    private  Button btnAbrirMetodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrirListener = findViewById(R.id.id_button);

        btnAbrirListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(
                        view,
                        "Botão pressionado - Listener",
                        Snackbar.LENGTH_LONG
                ).setAction("Confirmar?", new View.OnClickListener()
                { // Executa de forma encadeada o metodo setAction()
                    @Override
                    public void onClick(View v) {

                        btnAbrirListener.setText("Botão abrir alterado");

                    }
                }).show(); // Executa de forma encadeada o metodo show()
            }
        });
    }

    public void abrirSnackBar(View view){

        Snackbar.make(
                view,
                "Botão Pressionado - Metodo",
                Snackbar.LENGTH_LONG
        ).show();
    }
}