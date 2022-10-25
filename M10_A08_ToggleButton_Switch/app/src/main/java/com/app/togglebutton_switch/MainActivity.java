package com.app.togglebutton_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textSwitch;
    private TextView textToggleButton;
    private CheckBox checkBoxSenha;
    private TextView textCheckbox;
    private TextView textSwitchListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.id_toggleButton);
        textSwitch = findViewById(R.id.id_txtSwitch);
        textToggleButton = findViewById(R.id.id_txtTogglebutton);
        switchSenha = findViewById(R.id.id_switch);
        checkBoxSenha = findViewById(R.id.id_checkBox);
        textCheckbox = findViewById(R.id.id_textCheckbox);
        textSwitchListener = findViewById(R.id.id_txtSwitchListener);
        adicionarListener();

    }

    public void  adicionarListener(){ // Metodo ouvinte para mudar texto no momento que botao for clicado.

        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if(isChecked){
                    textSwitchListener.setText("ligado");
                }else {
                    textSwitchListener.setText("desligado");
                }
            }
        });
    }

    public void enviar(View view){

        if(switchSenha.isChecked()){
            textSwitch.setText("Switch ligado");
        }else{
            textSwitch.setText("Switch desligado");
        }
        if(toggleSenha.isChecked()){
            textToggleButton.setText("ToggleButton ligado");
        }else{
            textToggleButton.setText("ToggleButton desligado");
        }
        if(checkBoxSenha.isChecked()){
            textCheckbox.setText("Checkbox ligado");
        }else{
            textCheckbox.setText("Checkbox desligado");
        }
    }
}