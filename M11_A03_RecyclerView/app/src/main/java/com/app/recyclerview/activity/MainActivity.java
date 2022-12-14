package com.app.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.app.recyclerview.RecyclerItemClickListener;
import com.app.recyclerview.model.Filme;
import com.app.recyclerview.adapter.Adapter;
import com.app.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme>  listaFilme = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.id_recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //Configurar adaptar
        Adapter adapter = new Adapter(listaFilme);


        // Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); // server para otimizar o RecyclerView que terá tamanho fixo
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this, LinearLayout.VERTICAL)); // Decora as tabelas com linha vertical
        recyclerView.setAdapter(adapter);

        // Recupera Evento de click na lista
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Filme filme = listaFilme.get(position);

                                Toast.makeText(
                                        getApplicationContext(),
                                        filme.getTitulo() + " - " + filme.getAno() + "-" + filme.getGenero(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Clique longo",
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Clique curto",
                                        Toast.LENGTH_SHORT
                                ).show();
                            }
                        }
                )
        );
    }

    public  void criarFilmes(){

        Filme filme = new Filme("Home Aranha - De volta ao lar", "Aventura", "2017");
        listaFilme.add(filme);

        filme = new Filme("Mulher Maravilha", "Fantasia", "2017");
        listaFilme.add(filme);

        filme = new Filme("Liga da Justiça", "Ficção", "2017");
        listaFilme.add(filme);

        filme = new Filme("Capitão América - Guerra Civil", "Aventura/Ficção", "2016");
        listaFilme.add(filme);

        filme = new Filme("It: A Coisa", "Drama/Terror", "2017");
        listaFilme.add(filme);

        filme = new Filme("Pica-Pau: O Filme", "Comédia/Animação", "2017");
        listaFilme.add(filme);

        filme = new Filme("A Múmia", "Terror", "2017");
        listaFilme.add(filme);

        filme = new Filme("A Bela e a Fera", "Romance", "2017");
        listaFilme.add(filme);

        filme = new Filme("Meu Malvado Favorito 3", "Comédia", "2017");
        listaFilme.add(filme);

        filme = new Filme("Carros 3", "Comédia", "2017");
        listaFilme.add(filme);

        filme = new Filme("Home de Ferro 2", "Aventura", "2017");
        listaFilme.add(filme);

        filme = new Filme("Godzila - Rei dos Mares", "Ficção", "2017");
        listaFilme.add(filme);
    }
}