package com.list;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        return "com.list.Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
