package com.company;

public class VehiculoAuto extends Vehiculo {

    public VehiculoAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGuiro, String patente) {
        super(velocidad, aceleracion, anguloDeGuiro, patente);
        this.peso = 1000 ;
        this.ruedas =4;
    }




}
