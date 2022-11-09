package com.app.enviandodadosnaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText Nome;
    private  TextInputEditText Email;
    private Button btn_Enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nome = findViewById(R.id.id_txtNome);
        Email = findViewById(R.id.id_txtEmail);
        btn_Enviar = findViewById(R.id.id_btnEnviar);


        btn_Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Passa os dados para outra activity
                intent.putExtra("nome", Nome.getText().toString());
                intent.putExtra("email", Email.getText().toString());


                startActivity(intent);

            }
        }
        );
    }


}