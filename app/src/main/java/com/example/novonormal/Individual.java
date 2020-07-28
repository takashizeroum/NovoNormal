package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Individual extends AppCompatActivity {

    String[] individual = {"Adote medidas básicas de higiene, como lavar bem as mãos (dedos, unhas, punho, palma e dorso) com água e sabão e, de preferência, utilizar toalhas de papel para secá-las. Além do sabão, outro produto indicado para higienizar as mãos é o álcool gel, que também serve para limpar objetos como celulares e itens pessoais diversos.",
            "Use lenço descartável para sua higiene nasal. Deve-se cobrir o nariz e a boca com um lenço de papel quando espirrar ou tossir e jogá-lo no lixo;\n" +
                    "Caso não tenha lenço de papel disponível ao tossir e espirrar, use o braço dobrado (e não as mãos) para cobrir o nariz e a boca.\n" +
                    "Evite tocar olhos, nariz e boca sem que as mãos estejam limpas"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);


        ListView lista = (ListView) findViewById(R.id.listin);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, individual);

        lista.setAdapter(adapter);
    }


    public void irMenu(View view) {
        Intent voltarMenu = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarMenu);
    }


}