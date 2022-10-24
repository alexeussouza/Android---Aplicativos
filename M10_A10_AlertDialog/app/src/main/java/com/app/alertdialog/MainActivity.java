package com.app.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void abrirDialog(View view){

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar titulo da mensagem
        dialog.setTitle("Titulo da dialog");
        dialog.setMessage("Mensagem da dialog");

        //Configurar cancelamento
        dialog.setCancelable(false); // obriga o usuario a ciclar em sim ou não, se clicar fora da mensagem a tela não fecha.

        //Configurar icone
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);

        // Configurar ações para sim
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão sim",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Configurar ações para não
        //Caso não queira nenhuma ação, basta não configurar esta ação para dialog
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão não",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Criar e exibir AlertDialog
        dialog.create();
        dialog.show();


    }
}