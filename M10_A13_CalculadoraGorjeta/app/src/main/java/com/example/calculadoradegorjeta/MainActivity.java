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

        valorServico = findViewById(R.id.id_valorServico);
        textPercentual = findViewById(R.id.id_percentual);
        textGorjeta = findViewById(R.id.id_gorjeta);
        textTotal = findViewById(R.id.id_valorTotal);
        seekGorjeta = findViewById(R.id.id_seekBar);

        seekGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = i;
                textPercentual.setText(Math.round(porcentagem) + " %");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textTotal.setText("Clicou no botao");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(){

        String valorRecuperado = valorServico.getText().toString();
        if(valorRecuperado==null || valorRecuperado.equals("")){
            Toast.makeText(
                    getApplicationContext(),
                    "Digite um valor primeiro",
                    Toast.LENGTH_LONG
            ).show();
        }else{

            //Convert string para double
            double valorDigitado = Double.parseDouble(valorRecuperado);

            //calcula a gorjeta total
            double gorjeta = valorDigitado*(porcentagem/100);
            double valorTotal = valorDigitado+gorjeta;
            textGorjeta.setText("" + Math.round(gorjeta));
            textTotal.setText("" + valorTotal);
        }
    }
}