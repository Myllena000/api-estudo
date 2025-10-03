package com.myllena.aprendendospring.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Materia {

    private String nome;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String observacao;
    private LocalDate dataRegistro = LocalDate.now();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
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
