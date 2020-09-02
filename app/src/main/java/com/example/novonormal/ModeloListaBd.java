package com.example.novonormal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ModeloListaBd extends AppCompatActivity {


    List<Locais> listaGenerica;
    Adaptador Adapter;
    SQLiteDatabase meubd;
    ListView listView;
    String nometabela = "farmacia";
    Bundle put;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelo_lista_bd);
        put = getIntent().getExtras();
        nometabela = put.getString("chave");


        listView = findViewById(R.id.listmodelbd);
        listaGenerica = new ArrayList<>();

        meubd = openOrCreateDatabase(viewBanco.NOME_BANCO_DE_DADOS, MODE_PRIVATE, null);

        visual();

        Button btnvold = findViewById(R.id.bdmen);
        btnvold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent casa = new Intent(getApplicationContext(), viewBanco.class);
                startActivity(casa);
            }
        });

        Button btncada = findViewById(R.id.addbdmm);
        btncada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent casa = new Intent(getApplicationContext(), Adicionabd.class);
                casa.putExtra("chave", nometabela);
                startActivity(casa);
            }
        });


    }


    private void visual() {

        Cursor cursorlista = meubd.rawQuery("SELECT * FROM " + nometabela + "", null);


        if (cursorlista.moveToFirst()) {
            do {
                listaGenerica.add(new Locais(
                        cursorlista.getInt(0),
                        cursorlista.getString(1),
                        cursorlista.getString(2),
                        cursorlista.getString(3)

                ));
            } while (cursorlista.moveToNext());
        }
        cursorlista.close();

        //Verificar o layout
        Adapter = new Adaptador(this, R.layout.itemlista, listaGenerica, meubd, nometabela);

        listView.setAdapter(Adapter);


    }


}









