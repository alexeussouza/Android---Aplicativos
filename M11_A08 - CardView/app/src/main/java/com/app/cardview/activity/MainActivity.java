package com.app.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.app.cardview.R;
import com.app.cardview.adapter.PostagemAdapter;
import com.app.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPostagem;

    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPostagem = findViewById(R.id.id_recyclerView);

        //Define layout Obs. abaixo temos exemplo de tres tipos de LayoutManager

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewPostagem.setLayoutManager(layoutManager);

       //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
       //layoutManager.setOrientation(LinearLayout.HORIZONTAL);

       // RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        //recyclerViewPostagem.setLayoutManager(layoutManager);

        //Define adapter
        prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerViewPostagem.setAdapter(adapter);

    }

    public  void prepararPostagens(){

        Postagem p;

        p = new Postagem("Alexandre Eutaquio", "Viagem em Las Vegas", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Matheus Eutaquio", "Viagem em Escolar", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Victoria Eutaquio", "Viagem Catequese", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Luzia Xavier Eutaquio", "Viagem Rio Janeiro", R.drawable.imagem4);
        this.postagens.add(p);

    }
}