package com.myllena.aprendendospring.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Materia {

    private UUID id = UUID.randomUUID();
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String observacao;
    private LocalDate dataRegistro = LocalDate.now();

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
}
