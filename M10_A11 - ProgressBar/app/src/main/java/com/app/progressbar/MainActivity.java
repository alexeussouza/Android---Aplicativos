package com.app.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressbarCircular;
    private  ProgressBar progressBarHorizontal;
    private int progresso=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressbarCircular = findViewById(R.id.id_progressBarCircular);
        progressBarHorizontal = findViewById(R.id.id_progressbarHorizontal);
        progressbarCircular.setVisibility(View.VISIBLE);
    }

    public void carregarProgressbar(View view){

        this.progresso = this.progresso+1;
        progressBarHorizontal.setProgress((this.progresso));
        if(this.progresso == 20){
            progressbarCircular.setVisibility(View.GONE);
        }


    }
}