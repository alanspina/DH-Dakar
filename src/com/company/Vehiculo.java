package com.company;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(velocidad, vehiculo.velocidad) &&
                Objects.equals(aceleracion, vehiculo.aceleracion) &&
                Objects.equals(anguloDeGuiro, vehiculo.anguloDeGuiro) &&
                Objects.equals(patente, vehiculo.patente) &&
                Objects.equals(peso, vehiculo.peso) &&
                Objects.equals(ruedas, vehiculo.ruedas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidad, aceleracion, anguloDeGuiro, patente, peso, ruedas);
    }

}
