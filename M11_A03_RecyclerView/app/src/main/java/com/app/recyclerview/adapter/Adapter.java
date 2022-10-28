package com.app.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.app.recyclerview.R;
import com.app.recyclerview.model.Filme;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

  private List<Filme> listaFilmes;

    public Adapter(List <Filme> lista) {

        listaFilmes = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // criação da visualização do ViewHolder

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent,false );

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) { // visualização dos itens do ViewHolder
        Filme filme = listaFilmes.get(position); // retorna a posicao do filme na lista
        holder.titulo.setText(filme.getTitulo());
        holder.ano.setText(filme.getAno());
        holder.genero.setText(filme.getGenero());

    }

    @Override
    public int getItemCount() {

        return listaFilmes.size();    //OnbindViewHolder exibe o total de itens na visualização usando size()
    }

    public class  MyViewHolder extends  RecyclerView.ViewHolder{
        TextView titulo;
        TextView ano;
        TextView genero;


        public MyViewHolder(View itemView) {

            super(itemView);

            titulo = itemView.findViewById(R.id.id_titulo);
            ano = itemView.findViewById(R.id.id_ano);
            genero = itemView.findViewById(R.id.id_genero);
        }
    }
}
