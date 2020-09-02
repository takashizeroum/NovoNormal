package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btnEntrar = findViewById(R.id.btnEntrar);

        final EditText txtLogin = findViewById(R.id.txtLogin);
        final EditText txtSenha = findViewById(R.id.txtSenha);

        Button btnSair = findViewById(R.id.btnSair);
        Button btncad = findViewById(R.id.btnCadastrar);


        /*!!!!!!!!!!!!!!!!!sem autenticação para testes!!!!!!!!!!!!!!!!!!!!!!!*/
        final SQLiteDatabase meuBancoDeDados;

        final String NOME_BANCO_DE_DADOS = "users";

        meuBancoDeDados = openOrCreateDatabase(NOME_BANCO_DE_DADOS, MODE_PRIVATE, null);

        meuBancoDeDados.execSQL(
                "CREATE TABLE IF NOT EXISTS users (" +
                        "id integer PRIMARY KEY AUTOINCREMENT," +
                        "nome varchar(200) NOT NULL," +
                        "senha varchar NOT NULL );"
        );


        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                Toast.makeText(getApplicationContext(), "Bem Vindo ao Novo normal", Toast.LENGTH_SHORT).show();
            }
        });
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btncad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String insertSQL = "INSERT INTO users (" +
                        "nome, " +
                        "senha)" +
                        "VALUES(?, ?);";
                String nome = txtLogin.getText().toString();
                String senha = txtSenha.getText().toString();

                meuBancoDeDados.execSQL(insertSQL, new String[]{nome, senha});


                Toast.makeText(getApplicationContext(), "Bem Vindo ao Novo normal", Toast.LENGTH_SHORT).show();
            }
        });


    }


}