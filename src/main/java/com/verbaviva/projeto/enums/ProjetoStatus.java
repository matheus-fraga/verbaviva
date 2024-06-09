package com.verbaviva.projeto.enums;

public enum ProjetoStatus {
    EM_ANALISE("Em análise"),
    PUBLICADO("Publicado"),
    REPROVADO("Reprovado");

    private final String descricao;

    ProjetoStatus(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}