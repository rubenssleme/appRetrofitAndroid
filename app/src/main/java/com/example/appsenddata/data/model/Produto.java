package com.example.appsenddata.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Chike on 12/10/2016.
 */

public class Produto {

    @SerializedName("nome")
    @Expose
    private String nome;

    @SerializedName("quantidade")
    @Expose
    private String quantidade;

    @SerializedName("valor")
    @Expose
    private Integer valor;

    @SerializedName("id")
    @Expose
    private Integer id;

    public Produto() {
    }

    public Produto(String nome, String quantidade, Integer valor, Integer id) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto post = (Produto) o;

        if (nome != null ? !nome.equals(post.nome) : post.nome != null) return false;
        if (quantidade != null ? !quantidade.equals(post.quantidade) : post.quantidade != null)
            return false;
        if (valor != null ? !valor.equals(post.valor) : post.valor != null) return false;
        return id != null ? id.equals(post.id) : post.id == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (quantidade != null ? quantidade.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}