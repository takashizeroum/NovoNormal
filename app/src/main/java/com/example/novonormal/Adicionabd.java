package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Adicionabd extends AppCompatActivity {


    SQLiteDatabase meubd;
    String nometabela;
    Bundle put;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionabd);

        put = getIntent().getExtras();
        nometabela = put.getString("chave");

        meubd = openOrCreateDatabase(viewBanco.NOME_BANCO_DE_DADOS, MODE_PRIVATE, null);
        Button btncada = findViewById(R.id.indempff);
        Button btnvold = findViewById(R.id.votaminmen);
        btnvold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent casa = new Intent(getApplicationContext(), viewBanco.class);
                startActivity(casa);
            }
        });


        btncada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarr();
            }
        });
    }


    private void adicionarr() {
        final EditText txtnome = findViewById(R.id.txtnomeform);
        final EditText txtcont = findViewById(R.id.txtcontatoform);
        final EditText txtend = findViewById(R.id.txtendereçoform);

        String insertSQL = "INSERT INTO " + nometabela + " (" +
                "nome, " +
                "endereço," +
                "contato)" +
                "VALUES(?, ?, ?);";
        String nome = txtnome.getText().toString();
        String end = txtcont.getText().toString();
        String cont = txtend.getText().toString();

        meubd.execSQL(insertSQL, new String[]{nome, end, cont});

        Intent casa = new Intent(getApplicationContext(), viewBanco.class);
        startActivity(casa);
        Toast.makeText(getApplicationContext(), "cadastrado na tabela farmacia", Toast.LENGTH_SHORT).show();
    }


}