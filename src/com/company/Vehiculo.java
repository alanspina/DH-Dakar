package com.company;

public abstract class Vehiculo {
    private Integer velocidad;
    private Integer aceleracion;
    private Integer anguloDeGuiro;
    private String patente;
    protected Integer peso;
    protected Integer ruedas;

    public Vehiculo(Integer velocidad, Integer aceleracion, Integer anguloDeGuiro, String patente, Integer peso, Integer ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGuiro = anguloDeGuiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public Vehiculo(Integer velocidad, Integer aceleracion, Integer anguloDeGuiro, String patente) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGuiro = anguloDeGuiro;
        this.patente = patente;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Integer aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Integer getAnguloDeGuiro() {
        return anguloDeGuiro;
    }

    public void setAnguloDeGuiro(Integer anguloDeGuiro) {
        this.anguloDeGuiro = anguloDeGuiro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }
}
