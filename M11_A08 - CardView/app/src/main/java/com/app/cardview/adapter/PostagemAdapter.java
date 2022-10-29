package com.app.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.cardview.R;
import com.app.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHoler> {
    private List<Postagem> postagem;

    public PostagemAdapter(List <Postagem> listaPostagens) {
        this.postagem = listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_postagem, parent, false);

        return new MyViewHoler(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoler holder, int position) {
        Postagem p = postagem.get(position);

        holder.nome.setText(p.getNome());
        holder.postagem.setText(p.getPostagem());
        holder.imagem.setImageResource(p.getImagem());

    }

    @Override
    public int getItemCount() {
        return postagem.size();
    }

    public  class MyViewHoler extends RecyclerView.ViewHolder{

            private TextView nome;
            private TextView postagem;
            private ImageView imagem;

        public MyViewHoler(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.id_textNome);
            postagem = itemView.findViewById(R.id.id_textPostagem);
            imagem = itemView.findViewById(R.id.id_imagePostagem);
        }
    }
}
