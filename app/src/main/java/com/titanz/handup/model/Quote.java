package com.titanz.handup.model;

public class Quote {

    private String nome;
    private String cod;
    private String valor;
    private String oscilacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = "R$ "+valor;
    }

    public String getOscilacao() {
        return oscilacao;
    }

    public void setOscilacao(String oscilacao) {
        this.oscilacao = oscilacao+"%";
    }
}
