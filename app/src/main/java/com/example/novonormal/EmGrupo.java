package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EmGrupo extends AppCompatActivity {


    String[] grupo = {"Mantenha distância mínima de 1 (um) metro entre pessoas em lugares públicos e de convívio social. Evite abraços, beijos e apertos de mãos. Adote um comportamento amigável sem contato físico, mas sempre com um sorriso no rosto. Não compartilhe objetos de uso pessoal como talheres, toalhas, pratos e copos.",
            "Recomenda-se a utilização de máscaras em todos os ambientes. As máscaras de tecido (caseiras/artesanais), não são Equipamentos de Proteção Individual (EPI), mas podem funcionar como uma barreira física, em especial contra a saída de gotículas potencialmente contaminadas.",
            "Ao tossir ou espirrar, cubra nariz e boca com lenço ou com a parte interna do cotovelo ou procure espirrar em direção ao solo caso as outras medidas não forem possiveis."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_em_grupo);


        ListView lista = (ListView) findViewById(R.id.listgr);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grupo);

        lista.setAdapter(adapter);


    }


    public void irMenu(View view) {
        Intent voltarMenu = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarMenu);
    }
}