package com.example.novonormal;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import java.util.List;


public class Adaptador extends ArrayAdapter<Locais> {

    String nometabela;

    Context contexto;
    int listaLay;
    List<Locais> listalocais;
    SQLiteDatabase meuBancoDeDados;


    public Adaptador(Context contexto, int itemlista, List<Locais> empregadosList, SQLiteDatabase meuBancoDeDados, String nometabela) {

        super(contexto, itemlista, empregadosList);

        this.contexto = contexto;
        this.listaLay = itemlista;
        this.listalocais = empregadosList;
        this.meuBancoDeDados = meuBancoDeDados;
        this.nometabela = nometabela;


    }


    //Inflar layout com o modelo e suas ações
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(contexto);
        View view = inflater.inflate(listaLay, null);

        final Locais locais = listalocais.get(position);

        TextView txtViewNome = view.findViewById(R.id.titulobd);
        TextView txttViewcont = view.findViewById(R.id.contatobd);
        TextView txtViewend = view.findViewById(R.id.enderecobd);

        txtViewNome.setText(locais.getNome());
        txttViewcont.setText(locais.getLocal());
        txtViewend.setText(locais.getContato());

        Button btnExcluir = view.findViewById(R.id.excluibdn);

        Button btnEdita = view.findViewById(R.id.editabdn);


        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sql = "DELETE FROM " + nometabela + " WHERE id = ?";
                meuBancoDeDados.execSQL(sql, new Integer[]{locais.getId()});
                Toast.makeText(contexto, "Excluido com sucesso", Toast.LENGTH_SHORT).show();
                rechar();
            }
        });

        btnEdita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alterar(locais);
            }
        });


        return view;

    }

    public void alterar(final Locais local) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(contexto);

        LayoutInflater inflater = LayoutInflater.from(contexto);

        View view = inflater.inflate(R.layout.caixa2, null);
        builder.setView(view);

        final EditText cmpnome = view.findViewById(R.id.txtnomeform2);
        final EditText cmpcon = view.findViewById(R.id.txtcontatoform2);
        final EditText cmpend = view.findViewById(R.id.txtendereçoform2);
        cmpnome.setText(local.getNome());
        cmpcon.setText(local.getContato());
        cmpend.setText(local.getLocal());

        final AlertDialog dialog = builder.create();
        dialog.show();

        view.findViewById(R.id.ediemp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = cmpnome.getText().toString().trim();
                String con = cmpcon.getText().toString().trim();
                String end = cmpend.getText().toString().trim();

                String sql = "UPDATE " + nometabela + " SET nome = ?, endereço = ?, contato = ? WHERE id = ?";
                meuBancoDeDados.execSQL(sql,
                        new String[]{nome, end, con, String.valueOf(local.getId())});
                Toast.makeText(contexto, "Empregado alterado com sucesso!", Toast.LENGTH_LONG).show();


                rechar();
                dialog.dismiss();
            }
        });


    }

    public void rechar() {
        Cursor cursorEmpregados = meuBancoDeDados.rawQuery("SELECT * FROM " + nometabela, null);
        if (cursorEmpregados.moveToFirst()) {
            listalocais.clear();
            do {
                listalocais.add(new Locais(
                        cursorEmpregados.getInt(0),
                        cursorEmpregados.getString(1),
                        cursorEmpregados.getString(2),
                        cursorEmpregados.getString(3)

                ));
            } while (cursorEmpregados.moveToNext());
        }
        cursorEmpregados.close();
        notifyDataSetChanged();
    }


}








