package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void casaa(View view) {
        Intent casa = new Intent(getApplicationContext(), EmCasa.class);
        startActivity(casa);
    }


    public void trabalho(View view) {
        Intent casa = new Intent(getApplicationContext(), NoTrabalho.class);
        startActivity(casa);
    }

    public void publico(View view) {
        Intent casa = new Intent(getApplicationContext(), Publico.class);
        startActivity(casa);
    }

    public void particular(View view) {
        Intent casa = new Intent(getApplicationContext(), Particular.class);
        startActivity(casa);
    }

    public void individual(View view) {
        Intent casa = new Intent(getApplicationContext(), Individual.class);
        startActivity(casa);
    }

    public void grupo(View view) {
        Intent casa = new Intent(getApplicationContext(), EmGrupo.class);
        startActivity(casa);
    }


    public void sair(View view) {
        Intent casa = new Intent(getApplicationContext(), Login.class);
        startActivity(casa);
        finish();
    }

    public void locais(View view) {
        Intent casa = new Intent(getApplicationContext(), viewBanco.class);
        startActivity(casa);
    }


}




