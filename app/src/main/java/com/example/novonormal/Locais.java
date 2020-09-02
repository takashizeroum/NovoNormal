package com.example.novonormal;

public class Locais {


    String nome, local, contato;
    int id;


    public Locais() {
    }

    public Locais(int id, String nome, String local, String contato) {
        this.nome = nome;
        this.id = id;
        this.local = local;
        this.contato = contato;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
