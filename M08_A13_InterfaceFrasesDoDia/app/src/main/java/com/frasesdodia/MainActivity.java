package com.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        int x = new Random().nextInt(10); // gera numeros de 0 a 9
        TextView texto = findViewById(R.id.txtResultado);

        String[] frases = {
                "O importante não é vencer todos os dias, mas lutar sempre",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
                "É melhor conquistar a si mesmo do que vencer mil batalhas.",
                "Quem ousou conquistar e saiu pra lutar, chega mais longe!",
                "Enquanto houver vontade de lutar haverá esperança de vencer.",
                "Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto.",
                "O medo de perder tira a vontade de ganhar.",
                "Aquele que não tem confiança nos outros, não lhes pode ganhar a confiança.",
                "Escolher o seu tempo é ganhar tempo.",
                "Perder para a razão, sempre é ganhar.",
                "Arriscamo-nos a perder quando queremos ganhar demais.",
                "Muitos sabem ganhar dinheiro, mas poucos sabem gastá-lo.",
                "Se você pretende ser rico, pense em economizar tanto quanto em ganhar.",
                "O homem digno ganha para viver; o menos honesto vive para ganhar.",
                "Para ganhar aquilo que vale a pena ter, pode ser necessário perder tudo mais.",
                "A maior caridade é habilitar o pobre a ganhar a sua vida.",
                "O mundo está perdido para aqueles que o querem ganhar.",
                "Quem sabe o que se pode ganhar num dia jamais furta.",
                "Loteria: acho que, jogando ou não, você tem a mesma chance de ganhar"
        };

        texto.setText(frases[x]);
    }
}