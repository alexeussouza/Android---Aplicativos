package com.app.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.app.fragments.R;
import com.app.fragments.fragment.ContatosFragment;
import com.app.fragments.fragment.ConversasFragment;
import com.app.fragments.fragment.StatusFragment;

public class MainActivity extends AppCompatActivity {
    private Button btnConversas;
    private Button btnContatos;
    private Button btnStatus;
    private FrameLayout FrameConteudo;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;
    private StatusFragment statusFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContatos = findViewById(R.id.btnContatos);
        btnConversas = findViewById(R.id.btnConversas);
        btnStatus = findViewById(R.id.btnStatus);
        FrameConteudo = findViewById(R.id.id_FrameConteudo);

        //Remover sombra da ActionBar
        getSupportActionBar().setElevation(5);

        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();
        statusFragment = new StatusFragment();

        //Configurar objeto para o Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.id_FrameConteudo, conversasFragment);
        transaction.commit();

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transactionConversas = getSupportFragmentManager().beginTransaction();
                transactionConversas.replace(R.id.id_FrameConteudo, conversasFragment);
                transactionConversas.commit();
            }
        });

        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transactionContatos = getSupportFragmentManager().beginTransaction();
                transactionContatos.replace(R.id.id_FrameConteudo, contatosFragment);
                transactionContatos.commit();
            }
        });

        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transactionStatus = getSupportFragmentManager().beginTransaction();
                transactionStatus.replace(R.id.id_FrameConteudo, statusFragment);
                transactionStatus.commit();
            }
        });
    }
}