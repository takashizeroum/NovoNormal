package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Particular extends AppCompatActivity {


    String[] particular = {"Utilizar álcool gel antes de subir e após descer do veículo, pois o vírus pode ser transmitido por objetos e superfícies.Utilize máscaras de tecido mesmo dentro do veículo.",
            "No transporte particular , as empresas reforçam a higienização diária dos veículos, porém se possivel deve ser verificado a situação higiênica do veículo, e caso for o  com maior frequência durante o dia, além de manter as janelas abertas sempre que possível.Em trasnporte contratados atavés de aplicativos , além da higienização reforçada, as empresas redobram a atenção quanto à disponibilidade de álcool em gel em locais de atendimento e durante o embarque, mas deve sempre levar consigo seu ácool em gel."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particular);


        ListView lista = (ListView) findViewById(R.id.listpa);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, particular);

        lista.setAdapter(adapter);
    }


    public void irMenu(View view) {
        Intent voltarMenu = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarMenu);
    }
}