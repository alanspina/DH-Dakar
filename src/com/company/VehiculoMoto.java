package com.company;

public class VehiculoMoto extends Vehiculo {
    public VehiculoMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGuiro, String patente, Integer peso, Integer ruedas) {
        super(velocidad, aceleracion, anguloDeGuiro, patente,peso,ruedas);
        this.peso = 300;
        this.ruedas =2;
    }
}
