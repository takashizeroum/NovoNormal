package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class viewBanco extends AppCompatActivity {

    public SQLiteDatabase meubd;
    static final String NOME_BANCO_DE_DADOS = "locais";
    List<Locais> listaGenerica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_banco);

        Button btncada = findViewById(R.id.votamenp);
        btncada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent casa = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(casa);
            }
        });

        meubd = openOrCreateDatabase(NOME_BANCO_DE_DADOS, MODE_PRIVATE, null);


        meubd.execSQL(
                "CREATE TABLE IF NOT EXISTS mercado (" +
                        "id integer PRIMARY KEY AUTOINCREMENT," +
                        "nome varchar(200) NOT NULL," +
                        "endereço varchar(200) NOT NULL," +
                        "contato varchar NOT NULL );"
        );

        meubd.execSQL(
                "CREATE TABLE IF NOT EXISTS farmacia (" +
                        "id integer PRIMARY KEY AUTOINCREMENT," +
                        "nome varchar(200) NOT NULL," +
                        "endereço varchar(200) NOT NULL," +
                        "contato varchar NOT NULL );"
        );

        meubd.execSQL(
                "CREATE TABLE IF NOT EXISTS restaurante (" +
                        "id integer PRIMARY KEY AUTOINCREMENT," +
                        "nome varchar(200) NOT NULL," +
                        "endereço varchar(200) NOT NULL," +
                        "contato varchar NOT NULL );"
        );


    }


    public void listarfarmacias(View view) {


        Intent casa = new Intent(getApplicationContext(), ModeloListaBd.class);
        casa.putExtra("chave", "farmacia");
        startActivity(casa);

    }

    public void listarrestaurantes(View view) {


        Intent casa = new Intent(getApplicationContext(), ModeloListaBd.class);
        casa.putExtra("chave", "restaurante");
        startActivity(casa);


    }

    public void listarmercados(View view) {


        Intent casa = new Intent(getApplicationContext(), ModeloListaBd.class);
        casa.putExtra("chave", "mercado");
        startActivity(casa);


    }


}