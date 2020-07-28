package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NoTrabalho extends AppCompatActivity {

    String[] trabalho = {"É preciso limpar as superfícies das mesas e estações de trabalho com desinfetante regularmente porque a contaminação de superfícies é uma das principais formas de disseminação do coronavírus e outras infecções.\n" +
            "As empresas devem incentivar os funcionários a ficarem em casa, caso eles apresentem tosse ou febre leve (37.3º ou mais). Se eles tiverem que tomar medicamentos como paracetamol, ibuprofeno ou aspirina, que podem mascarar a infecção, também devem permanecer em casa. É uma medida importante para evitar a contaminação dos outros funcionários.",
            "Coloque folhetos informativos com as instruções para a lavagem correta das mãos, principalmente nos banheiros. As empresas podem ainda realizar palestras com agentes de saúde e segurança ocupacional para seus funcionários sobre o coronavírus."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_trabalho);


        ListView lista = (ListView) findViewById(R.id.listtr);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, trabalho);

        lista.setAdapter(adapter);
    }


    public void irMenu(View view) {
        Intent voltarMenu = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarMenu);
    }


}