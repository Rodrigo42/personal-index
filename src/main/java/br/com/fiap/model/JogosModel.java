package br.com.fiap.model;

import jakarta.persistence.Entity;

@Entity
public class JogosModel {

    String titulo;
    String desenvolvedora;
    String midia;
    int lancamento;
    boolean terminado;
    boolean platinado;
    String plataforma;

    public JogosModel(String titulo, String desenvolvedora, String midia, int lancamento, boolean terminado, boolean platinado, String plataforma) {
        this.titulo = titulo;
        this.desenvolvedora = desenvolvedora;
        this.midia = midia;
        this.lancamento = lancamento;
        this.terminado = terminado;
        this.platinado = platinado;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public boolean isPlatinado() {
        return platinado;
    }

    public void setPlatinado(boolean platinado) {
        this.platinado = platinado;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }


}
