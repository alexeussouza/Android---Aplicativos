package com.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

       public void selecionadoPedra(View view){

            this.opcapSelecionada("pedra"); // metodo recebe a opção selecionada
        }

        public void selecionadoPapel(View view){
            this.opcapSelecionada("papel"); // metodo recebe a opção selecionada
        }

        public void selecionadoTesoura(View view){
            this.opcapSelecionada("tesoura"); // metodo recebe a opção selecionada
        }

    public void opcapSelecionada(String opcaoUsuario) // recebe a opção selecionada pelo usuário
    {

        int numero = new Random().nextInt(3); // Gera numero aleatorio de 0 ate 2 para preecher as posições do array

        ImageView imagemResultado = findViewById(R.id.id_btn_EscolhaApp); // Seleciona id da imagem que exibe a escolha do App

        String[] opcoes = {"pedra", "papel","tesoura"}; // array com opções

        String opcaoApp = opcoes[numero]; // Recebe o array opções

        switch (opcaoApp){
            case "pedra": imagemResultado.setImageResource(R.drawable.pedra); // Seta imagem pedra caso a opção gerada pelo app seja "pedra"
                break;
            case "papel": imagemResultado.setImageResource(R.drawable.papel);  // Seta imagem papel caso a opção gerada pelo app seja "papel"
                break;
            case "tesoura": imagemResultado.setImageResource(R.drawable.tesoura); // Seta imagem tesoura caso a opção gerada pelo app seja "tesoura"
                break;
            default:
        }

        TextView resultado = findViewById(R.id.id_txt_Escolha);

        if(opcaoUsuario.equals("pedra") && opcoes[numero].equals("tesoura") || // Caso opção de usuario seja vencedor
           opcaoUsuario.equals("tesoura") && opcoes[numero].equals("papel") ||
           opcaoUsuario.equals("papel") && opcoes[numero].equals("pedra"))
        {
            resultado.setText("Você Ganhou :-)");
        }
        else if(opcaoUsuario.equals("tesoura") && opcoes[numero].equals("pedra") || // Caso opção do App seja vencedor
                opcaoUsuario.equals("papel") && opcoes[numero].equals("tesoura") ||
                opcaoApp.equals("pedra") && opcoes[numero].equals("papel"))
        {
            resultado.setText("Você perdeu :-(");
        }
        else{
            resultado.setText("Ocorreu emprate!");  // Caso opção seja empate
        }
    }
}