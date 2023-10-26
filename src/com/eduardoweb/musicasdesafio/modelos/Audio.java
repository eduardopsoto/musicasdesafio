package com.eduardoweb.musicasdesafio.modelos;

public class Audio {
    private String titulo;
    private int quantReproducoes;
    private int quantCurtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantReproducoes() {
        return quantReproducoes;
    }

    public int getQuantCurtidas() {
        return quantCurtidas;
    }

    public int reproduz(){
        return quantReproducoes++;
    }

    public void curte(){
        quantCurtidas++;
    }
}


