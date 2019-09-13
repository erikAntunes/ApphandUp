package com.titanz.handup.model;

public class Quote {

    private String nome;
    private int cod;
    private int valor;
    private int oscilacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getOscilacao() {
        return oscilacao;
    }

    public void setOscilacao(int oscilacao) {
        this.oscilacao = oscilacao;
    }
}
