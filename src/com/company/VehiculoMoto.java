package com.company;

public class VehiculoMoto extends Vehiculo {
    public VehiculoMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGuiro, String patente) {
        super(velocidad, aceleracion, anguloDeGuiro, patente);
        this.peso = 300;
        this.ruedas =2;
    }
}
