package com.app.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaCidades;
    private String[] itens = {
          "Angra dos Reis",  "Caldas Novas","Campos do Jordão","Costa do Sauípe","ILhéus","Porto Seguro",
            "Tiradentes","Praga","Santiago","Zurique","Caribe","Buenos Aires","Budapeste","Cancún",
            "Aruba","Los Angeles", "Las Vegas","Argentina","Nova Jersey","Orlando","Disney","Japão"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaCidades = findViewById(R.id.id_ListView);

        //Criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, // Id do layout, clicar com control em simple_list_item_1 para verificar o código xml
                itens
        );

        //Adiciona adaptador para a lista
        listaCidades.setAdapter(adaptador);

        //Recupera valor clicado na lista

        listaCidades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listaCidades.getItemAtPosition(i).toString(); // Recupera o item clicado pelo posicao
                Toast.makeText(
                        getApplicationContext(),
                        valorSelecionado,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });


    }
}