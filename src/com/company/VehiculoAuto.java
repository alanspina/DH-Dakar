package com.company;

public class VehiculoAuto extends Vehiculo {

    public VehiculoAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGuiro, String patente, Integer peso, Integer ruedas) {
        super(velocidad, aceleracion, anguloDeGuiro, patente,peso,ruedas);
        this.peso = 1000 ;
        this.ruedas =4;
    }




}
