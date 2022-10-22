package com.app.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private TextInputEditText email;
    private TextView resultado;
    private CheckBox chk_branco;
    private CheckBox chk_verde;
    private CheckBox chk_vermelho;
    private String texto="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.id_txt_Nome);
        email = findViewById(R.id.id_txt_email);
        chk_verde = findViewById(R.id.id_checkbox_verde);
        chk_vermelho = findViewById(R.id.id_checkBox_Vermelho);
        chk_branco = findViewById(R.id.id_checkBox_branco);
        resultado = findViewById(R.id.id_txt_Resultado);
    }

    public  void checkboxVerificar(){

        texto="";
        if(chk_verde.isChecked()){ // captura texto do checkbox se botão estiver selecionado
            texto = chk_verde.getText().toString();
        }
        if(chk_vermelho.isChecked()){
            texto = texto + "\n" + chk_vermelho.getText().toString();
        }
        if(chk_branco.isChecked()){
            texto = texto + "\n" + chk_branco.getText().toString();
        }
    }

    public void exibirDados(View view){
        checkboxVerificar();
        resultado.setText("Nome: " + nome.getText().toString() + "\nEmail: " + email.getText().toString() +
                "\n" + texto);
    }

    public void limparDados(View view){

        resultado.setText("Resultado:");
        nome.setText("");
        email.setText("");
    }
}