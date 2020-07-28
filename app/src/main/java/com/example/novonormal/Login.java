package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btnEntrar = findViewById(R.id.btnEntrar);
        /*
        Button txtLogin = findViewById(R.id.txtLogin);
        Button txtSenha = findViewById(R.id.txtSenha);

         */
        Button btnSair = findViewById(R.id.btnSair);

        /*!!!!!!!!!!!!!!!!!sem autenticação para testes!!!!!!!!!!!!!!!!!!!!!!!*/


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


    }
}