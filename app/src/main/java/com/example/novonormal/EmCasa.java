package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EmCasa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_em_casa);


        String[] casa = {"Utilize produtos usuais para a limpeza doméstica, dando preferência para o uso da água sanitária (em uma solução de uma parte de água sanitária para 9 partes de água) para desinfetar superfícies (veja aqui como limpar)",
                "Utilize detergentes próprios para a higienização das louças e roupas. É importante separar roupas e roupas de cama de pessoas infectadas para que seja feita a higienização à parte. Caso não haja a possibilidade de fazer a lavagem dessas roupas imediatamente, a recomendação é que elas sejam armazenadas em sacos de lixo plástico até que seja possível lavar;",
                "Também é importante comprar antecipadamente e ter em suas residências medicamentos para dor e redução da febre (como paracetamol), controle da tosse (como xaropes e pastilhas), além de medicamentos de uso contínuo. Mas não compre de forma exagerada para que todos tenham acesso às formas de alívio dos sintomas."};


        ListView lista = (ListView) findViewById(R.id.listca);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, casa);

        lista.setAdapter(adapter);


    }


    public void irMenu(View view) {
        Intent voltarMenu = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarMenu);
    }
}
