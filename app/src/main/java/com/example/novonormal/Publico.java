package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Publico extends AppCompatActivity {

    String[] publico = {"Não levar as mãos ao rosto até que tenha a oportunidade de higienizá-las após sair do transporte público reduz o risco de contrair o novo coronavírus. Sempre que tossir ou espirrar, cubra a boca e o nariz com o antebraço, nunca com as mãos",
            "Utilizar álcool gel antes de subir e após descer do veículo, pois o vírus pode ser transmitido por objetos e superfícies\n" +
                    "Não leve as mãos ao rosto (olhos, boca e nariz) enquanto não tiver a oportunidade de higienizá-las, principalmente dentro do transporte. Utilize máscaras de tecido.Abra janelas, caso o transporte possua. Ambientes fechados são mais propícios à transmissão;\n" +
                    "Se possível, mantenha 1 metro de distância das outras pessoas.Limpe objetos pessoais que tocar durante o trajeto com álcool em gel (por exemplo, o celular)."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publico);


        ListView lista = (ListView) findViewById(R.id.listpu);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, publico);

        lista.setAdapter(adapter);
    }


    public void irMenu(View view) {
        Intent voltarMenu = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarMenu);
    }
}