package com.example.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText valorServico;
    private TextView textPercentual;
    private TextView textGorjeta;
    private TextView textTotal;
    private SeekBar seekGorjeta;
    private  double porcentagem =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recebe os valor da variavel pelo id
        valorServico = findViewById(R.id.id_valorServico);
        textPercentual = findViewById(R.id.id_percentual);
        textGorjeta = findViewById(R.id.id_gorjeta);
        textTotal = findViewById(R.id.id_valorTotal);
        seekGorjeta = findViewById(R.id.id_seekBar);

        //Metodo recebe eventos de clique e alteração de valor do seekbar
        seekGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = i;
                textPercentual.setText(Math.round(porcentagem) + " %");
                calcular();
            }
            //Metodo recebe eventos de OnStart clique do seekbar
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textTotal.setText("Clicou no botao");

            }
            //Metodo recebe eventos de OnStop Clique no seekbar (
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(){

        //recebe o valor do serviço digitado pelo cliente
        String valorRecuperado = valorServico.getText().toString();
        //
        //verifica se valor é null ou vazio, e pede para preencher o campo novamente se true
        if(valorRecuperado==null || valorRecuperado.equals("")){
            Toast.makeText(
                    getApplicationContext(),
                    "Digite um valor primeiro",
                    Toast.LENGTH_LONG
            ).show();
        }else{

            //Convert string para double
            double valorDigitado = Double.parseDouble(valorRecuperado);

            //calcula a gorjeta
            double gorjeta = valorDigitado*(porcentagem/100);

            //calcula valor total
            double valorTotal = valorDigitado+gorjeta;

            //Exibe os valores no campo de texto
            textGorjeta.setText("" + Math.round(gorjeta));
            textTotal.setText("" + valorTotal);
        }
    }
}