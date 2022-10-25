package com.app.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView alcool;
    private TextView gasolina;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Busca o valor dos campos pelo ID
        alcool = findViewById(R.id.id_txt_precoAlcool);
        gasolina = findViewById(R.id.id_txt_PrecoGasolina);
        resultado = findViewById(R.id.id_txt_Resultado);
    }

    public void calcularCombustivel(View view){

        String precoAlcool = alcool.getText().toString();
        String precoGasolina = gasolina.getText().toString();

        Boolean camposValidados = validarCampos(precoAlcool, precoGasolina); // Passagem dos valores para validação

        if(camposValidados)  // Se retorno de camposValidados for true calcula o preco
        {
            Double vAlcool = Double.parseDouble(precoAlcool);
            Double vGasolina = Double.parseDouble(precoGasolina);
            /*
             * Se (valorAcool / valorGasolina ) >= 0.7 melhor usar gasolina  */

            if(vAlcool / vGasolina >= 0.7)
                resultado.setText("Melhor usar Gasolina!");
            else
                resultado.setText("Melhor usar Alcool!");

        }else {
                resultado.setText("Preecha os preços primeiro!");
        }
    }

    public boolean validarCampos(String pAlcool, String pGasolina){  //Valida os campos se null ou vazio retorna false
        boolean bool=true;

        if((alcool == null || alcool.equals("")) || (gasolina == null || gasolina.equals(""))){
            bool=false;
        }
        return bool;
    }
}